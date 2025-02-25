package kz.enu.restvt.srs_1.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kz.enu.restvt.srs_1.entities.Account;
import kz.enu.restvt.srs_1.entities.Bank;
import kz.enu.restvt.srs_1.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MainContorller
{
    @Autowired
    ObjectMapper obMapper;

    // контроллеры для Account

    // запрос на добавление нового акаунта

    // ===============================================================================================
    @GetMapping("/accounts/{accountId}")
    public String get_account_listener(@PathVariable int accountId) throws JsonProcessingException
    {
        // 1) Извлечение акаунта по id
        Account account = new Account(
                accountId,
                "156-452-321-111",
                5000,
                Account.AccountType.DEPOSIT,
                true
        );

        String jsontext = null;

        jsontext = obMapper.writeValueAsString(account);

        return jsontext;
    }
    @PostMapping("/clients/{clientId}/accounts/new_account")
    public String new_account_listener(@RequestBody Account account, @PathVariable int clientId) throws JsonProcessingException
    {
        // 1) Создание счёта
        // 2) Добавление счёта в список клиентов
        String jsontext = null;

        jsontext = obMapper.writeValueAsString(account);

        return jsontext;
    }
    // ===============================================================================================

    // получение всей информации о клиенте включая список счетов
    @GetMapping("/banks/{bankId}/clients/{clientId}")
    public String get_client_listener(@PathVariable int clientId, @PathVariable int bankId) throws JsonProcessingException
    {
        Client client = new Client(
                clientId,
                "Bauyrzhan",
                "mendeshev.bauyrzhan@mail.ru",
                "+7 (777)792-7627"
        );

        String jsontext = null;

        jsontext = obMapper.writeValueAsString(client);

        return jsontext;
    }


    // создание нового клиента
    @PostMapping("/banks/{bankId}/clients/new_client")
    public String new_client_listener(@RequestBody Client client, @PathVariable int bankId) throws JsonProcessingException
    {
        // создание нового клиента в БД, и добавление его в список клиентов банка
        String jsontext = null;
        jsontext = obMapper.writeValueAsString(client);
        return jsontext;
    }

    // добавление нового счета для клиента
    @PostMapping("/banks/{bankId}/clients/{clientId}/add_account")
    public String add_account_listener(@RequestBody Account account, @PathVariable int bankId, @PathVariable int clientId)
        throws JsonProcessingException
    {
        Client client = new Client(
                clientId,
                "Bauyrzhan",
                "mendeshev.bauyrzhan@mail.ru",
                "+7 (777)792-7627"
        );

        client.addAccount(account);

        String jsontext = null;
        jsontext = obMapper.writeValueAsString(client);
        return jsontext;
    }
    // ===============================================================================================

    // получение информации о банке включая список банков
    @GetMapping("/banks/{bankId}")
    public String get_bank_listener(@PathVariable int bankId) throws JsonProcessingException
    {
        // запрос в БД на получение информации о банке по ID
        Bank bank = new Bank(
                bankId,
                "Kaspi Bank",
                "5639524597562338421",
                "Kazakhstan",
                150000000
        );

        String jsontext = null;

        jsontext = obMapper.writeValueAsString(bank);

        return jsontext;
    }

    @PostMapping("/banks/new_bank")
    public String new_bank_listener(@RequestBody Bank bank) throws JsonProcessingException
    {
        // создание нового клиента в БД, и добавление его в список клиентов банка
        String jsontext = null;
        jsontext = obMapper.writeValueAsString(bank);
        return jsontext;
    }

    // добавление нового счета для клиента
    @PostMapping("/banks/{bankId}/new_client")
    public String add_bank_listener(@RequestBody Client client, @PathVariable int bankId)
            throws JsonProcessingException
    {
        // запрос в БД на получение информации о банке по ID
        Bank bank = new Bank(
                bankId,
                "Kaspi Bank",
                "5639524597562338421",
                "Kazakhstan",
                150000000
        );

        bank.addClient(client);

        String jsontext = null;
        jsontext = obMapper.writeValueAsString(bank);
        return jsontext;
    }
}
