// Quinn Keenan, 04/10/2025

package com.github.kqfall1.IBM_OA_Algorithm_Challenges;

import com.github.kqfall1.kqfall1JavaUtils.CollectionPrinter;
import java.util.Arrays;

public class TestHarness
{
	private static int[] capacities = { -2, 0, 1, 1, 2, 3, 3, 4, 5 };
	private static final int[] transactions = { -12, 11, 33, -34 };

	public static void main(String[] args)
	{
		CollectionPrinter.print(transactions, "Transactions array");
		System.out.printf("The maximum number of processable transactions in the array" +
		" for the balance to stay positive is %d.%n", Challenge1.getMaxTransactions(transactions));

		CollectionPrinter.print(capacities, "Capacities array");
		capacities = Challenge2.getMaxUniqueCapacities(capacities);
		Arrays.sort(capacities);
		CollectionPrinter.print(capacities, "The largest possible subset given the capacities");
	}
}