package com.nestorcicardini.D2.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Table {
	private int tableNumber;
	private int maxOccupancy;
	private TableStatus status;

	enum TableStatus {
		OCCUPIED, AVAILABLE
	}

	public Table(int tableNumber, int maxOccupancy, Status status) {
		super();
		this.tableNumber = tableNumber;
		this.maxOccupancy = maxOccupancy;
		this.status = status;
	}

}
