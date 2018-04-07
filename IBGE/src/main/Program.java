package main;

import model.*;
import util.URLReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strUrl = "https://servicodados.ibge.gov.br/api/v1/localidades/municipios";
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String filePath = "E:\\Temp\\Java\\";
				//"D:\\temp\\IBGE\\";
		String fileFullName = filePath + "IBGE_MUNICIPIOS_" + dateFormat.format(date) + ".csv";
		// 2016/11/16 12:08:43

		Gson gson = new Gson();
		try {
			System.out.println("Lendo dados do IBGE...");
			municipio[] municipios = gson.fromJson(URLReader.readUrlString(strUrl), municipio[].class);

			System.out.println("Criando arquivo... [" + fileFullName + "]");
			File fileDir = new File(fileFullName);

			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir), "UTF8"));

			out.append("CODIGO;MUNICIPIO;ESTADO;SIGLA_ESTADO").append("\r\n");
			for (municipio item : municipios) {
				out.append(item.toString()).append("\r\n");
			}

			out.flush();
			out.close();
		} catch (Exception e) {
			System.out.println("Erro. " + e.toString());
		}

		System.out.println("Fim!");

	}

}
