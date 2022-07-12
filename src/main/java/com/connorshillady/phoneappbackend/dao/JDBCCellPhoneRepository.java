package com.connorshillady.phoneappbackend.dao;

import com.connorshillady.phoneappbackend.model.CellPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("CellPhoneRepository")
public class JDBCCellPhoneRepository implements CellPhoneDAO {
  
  @Autowired
  private JdbcTemplate jdbcTemplate;
  
  private static List<CellPhone> products = new ArrayList<>();
  
  @Override
  public int insertCellPhone(int PhoneId, CellPhone cellPhone) {
    String sql = "INSERT INTO CellPhones (PRICE, BRAND, STORAGE) VALUES (?, ?, ?)";
    return jdbcTemplate.update(sql, new Object[] {cellPhone.getPRICE(), cellPhone.getBRAND() , cellPhone.getSTORAGE()});
  }
  
  @Override
  public int updateCellPhone(int PhoneId, CellPhone cellPhone) {
    String sql = "UPDATE PRODUCTS SET PRICE=?, BRAND=?";
    return jdbcTemplate.update(sql, new Object[] {cellPhone.getPRICE(), cellPhone.getBRAND() , cellPhone.getSTORAGE()});
  }
  
  @Override
  public int deleteCellPhone(int PhoneId) {
    String sql = "DELETE FROM PRODUCTS WHERE ID = ?";
    return jdbcTemplate.update(sql, PhoneId);
  }
  
  @Override
  public List<CellPhone> queryCellPhones() {
    String sql = "SELECT * FROM PRODUCTS";
    return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(CellPhone.class));
  }
  
  @Override
  public Optional<CellPhone> queryCellPhone(int PhoneId) {
    CellPhone cellPhone = null;
    try {
      String sql = "SELECT * FROM PRODUCTS WHERE ID = ?";
      cellPhone = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(CellPhone.class), PhoneId);
      return Optional.ofNullable(cellPhone);
    }
    catch (IncorrectResultSizeDataAccessException e) {
      return Optional.ofNullable(cellPhone);
    }
  }
}