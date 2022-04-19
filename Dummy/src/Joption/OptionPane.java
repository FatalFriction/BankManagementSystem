package Joption;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class OptionPane {

    public static void sales(int Hari,String input, PrintWriter Output)
    {

        double Sales,Average,totalSale=0.0;
        DecimalFormat rupiah = new DecimalFormat("##,###.00");

        for(int n=1; n<=Hari;n++) {
            input = JOptionPane.showInputDialog("Penjualan hari " + n);
            Sales = Double.parseDouble(input);
            Output.println( n + ". \t Rp." + rupiah.format(Sales));
            totalSale += Sales;
        }
        Average = totalSale / Hari;

        Output.println("Total Penjualan : Rp." + rupiah.format(totalSale));
        Output.println("Rata-Rata Penjualan Harian : Rp." + rupiah.format(Average));
        Output.close();
    }

    public static void menu(int Hari,PrintWriter Output)
    {
        Output.println("Hari Berjualan : " + Hari);
        Output.println("\tPenjualan(Harian)");
        Output.println("=====================");
    }

    public static void txtinput()throws IOException
    {
        File jualan = new File("output.txt");

        if(jualan.exists())
        {
            Scanner Jualan = new Scanner(jualan);
            while (Jualan.hasNext())
            {
                System.out.println(Jualan.nextLine());
            }
            Jualan.close();
        }
        else {
            JOptionPane.showMessageDialog(null,"File does not exist!");
        }
    }


    public static void main(String[] args) throws IOException {

        PrintWriter OutputFile = new PrintWriter("output.txt");
        int Hari;
        Toko toko = new Toko("Jaya makmur","Kelontong", 1997, 9999999);
        System.out.print(toko.getBerdiri());

        String input = JOptionPane.showInputDialog("Input hari Berjualan : ");
        Hari = Integer.parseInt(input);

        menu(Hari,OutputFile);
        sales(Hari,input,OutputFile);
        txtinput();
    }
}
