// Quinn Keenan, 04/10/2025

package com.github.kqfall1.IBM_OA_Algorithm_Challenges;

import com.github.kqfall1.java.utils.CollectionConverter;
import com.github.kqfall1.java.utils.CollectionPrinter;
import java.util.Arrays;

public class TestHarness
{
	private static int[] capacities = { -2, 0, 1, 1, 2, 3, 3, 4, 5 };
	private static final int[] transactions = { -12, 11, 33, -34 };

	public static void main(String[] args)
	{
		var printer = new CollectionPrinter(System.out);

		printer.print(
			CollectionConverter.toIntegerArr(transactions),
			"Transactions array"
		);

		System.out.printf("The maximum number of processable transactions in the array" +
		" for the balance to stay positive is %d.%n", Challenge1.getMaxTransactions(transactions));

		printer.print(
			CollectionConverter.toIntegerArr(capacities),
			"Capacities array"
		);

		capacities = Challenge2.getMaxUniqueCapacities(capacities);
		Arrays.sort(capacities);

		printer.print(
			CollectionConverter.toIntegerArr(capacities),
			"The largest possible subset given the capacities"
		);
	}
}