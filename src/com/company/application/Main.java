package com.company.application;

import com.company.model.AccountNumbers;
import com.company.utils.CommonConstants;
import com.company.dto.AccountDetails;

import java.util.HashMap;
import java.util.Scanner;

public class Main extends AccountNumbers {

    public static void main(String[] args)
    {
        String username = null;
        String password = null;
        String userOption = null;
        String accountnumberFromUser = null;

        double depositedAmount = 0;

        AccountDetails accountDetails = new AccountDetails();
        HashMap<Integer, Double> accountNumber= registerAccounts();

        Scanner SC = new Scanner(System.in);
        System.out.println("Welcome to Zaid Bank");

        System.out.print("Enter  UserName: ");
        username = SC.nextLine();
        System.out.print("Enter password: ");
        password = SC.nextLine();

        do {


        if (username.equals(CommonConstants.username) && password.equals(CommonConstants.password)) {
            System.out.println("A :  Withdraw");
            System.out.println("B :  Deposit");
            System.out.println("C :  Check Balance");
            System.out.println("D :  Transfer Amount");
            System.out.println("E :  Exit");
            System.out.println("Enter Option");
            userOption= SC.nextLine();

           switch (userOption){
                case "A":

                    System.out.println("How much Amount you want to Withdraw");
                    depositedAmount = SC.nextDouble();
                    double sum1 = accountDetails.getBalance()-depositedAmount;
                    accountDetails.setBalance(sum1);
                    break;

                case "B":

                    System.out.println(" How much Amount you want to Deposit ??");
                    depositedAmount=SC.nextDouble();
                    double sum = depositedAmount+accountDetails.getBalance();
                    accountDetails.setBalance(sum);
                    break;

                case "C":

                    System.out.println("User Select Check Balance Option");
                    accountDetails.getBalance();
                    System.out.println("Your Balance is "+accountDetails.getBalance());
                    break;

                case "D":

                    System.out.println(" Enter Account Number  ");
                    accountnumberFromUser = SC.nextLine();

                    System.out.println("How much Amount you want to Transfer");
                    depositedAmount = SC.nextDouble();
                    for (HashMap.Entry<Integer,Double> entry :accountNumber.entrySet())
                    {
                    if (entry.getKey().toString().equals(accountnumberFromUser))
                    {
                        entry.setValue(entry.getValue()+depositedAmount);
                        System.out.println("Ammount Transfer success , new balance of user is  "+entry.getValue());

                    }
                }

                    double sum2 = accountDetails.getBalance()-depositedAmount;
                    accountDetails.setBalance(sum2);
                    break;

                case "E":
                    System.out.println("User Select Exit Option");
                    break;

            }
        } else {
            System.out.println("Error");
        }
        }while (!userOption.equals("E"));

        }






    }



