package bai03;

import java.time.LocalDate;

public class Test {
	public static String getQtyType(Trancastion[] trade) {
		int goldQty = 0;
		int currencyQty = 0;
		for (Trancastion trading : trade) {
			if (trading instanceof GoldTrade) {
				goldQty += trading.getQty();
			} else {
				currencyQty += trading.getQty();
			}
		}
		return "Tổng số lượng giao dịch vàng: " + goldQty + "\nTổng số lượng giao dịch tiền tệ: " + currencyQty;
	}

	public static double getAvgCurrencyTrade(Trancastion[] trade) {
		double total = 0;
		int count = 0;
		for (Trancastion trading : trade) {
			if (trading instanceof CurrencyTrade) {
				total += trading.getPrice();
				count++;
			}
		}
		return total / count;
	}

	public static String getTradeOver1Bilion(Trancastion[] trade) {
		String s = "";
		for (Trancastion trading : trade) {
			if (trading instanceof CurrencyTrade) {
				if (trading.calPrice() > 1000000000) {
					s += trading.toString() + "\n";
				}
			}
		}
		return s;
	}

	public static void main(String[] args) {
		Trancastion[] trade = new Trancastion[6];
		trade[0] = new GoldTrade("A5436", LocalDate.of(2023, 5, 15), 26525000, 5, "24K");
		trade[1] = new GoldTrade();
		trade[2] = new GoldTrade("C784", LocalDate.of(2023, 5, 15), 53690000, 14, "14K");
		trade[3] = new CurrencyTrade("65B74", LocalDate.of(2024, 7, 25), 2484500, 1000, 0.00004024954, "tiền VND");
		trade[4] = new CurrencyTrade("57H204", LocalDate.of(2025, 12, 12), 248450, 10, 0.00004024954, "tiền VND");
		trade[5] = new CurrencyTrade("21Y23", LocalDate.of(2026, 2, 4), 5000, 50, 24845, "tiền USD");
		for (Trancastion trading : trade) {
			System.out.println(trading);
		}
		System.out.println(getQtyType(trade));
		System.out.println("Thành tiền trung bình của giao dịch tiền tệ: " + getAvgCurrencyTrade(trade));
		System.out.println("các giao dịch có đơn giá hơn 1 tỷ\n" + getTradeOver1Bilion(trade));
	}
}
