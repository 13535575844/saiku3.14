package com.yibo.saiku.service.olap.drillthrough;

import com.yibo.saiku.olap.dto.resultset.AbstractBaseCell;

import java.sql.ResultSet;

public class DrillThroughResult {
	private final ResultSet resultSet;
	private final String[] simpleHeaders;
	private final AbstractBaseCell[][] cellHeaders;
	public DrillThroughResult(ResultSet resultSet, String[] simpleHeaders, AbstractBaseCell[][] cellHeaders) {
		this.resultSet = resultSet;
		this.simpleHeaders = simpleHeaders;
		this.cellHeaders = cellHeaders;
	}
	public String[] getSimpleHeaders() {
		return simpleHeaders;
	}
	public AbstractBaseCell[][] getCellHeaders() {
		return cellHeaders;
	}
	public ResultSet getResultSet() {
		return resultSet;
	}
}