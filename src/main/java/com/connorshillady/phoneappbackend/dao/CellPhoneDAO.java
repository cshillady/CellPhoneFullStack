package com.connorshillady.phoneappbackend.dao;

import com.connorshillady.phoneappbackend.model.CellPhone;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public interface CellPhoneDAO {
  default int insertCellPhone(CellPhone cellPhone) {
    Random random = new Random();
    int id = random.nextInt(100000, 10000000);
    return insertCellPhone(id, cellPhone);
  }
  int insertCellPhone(int PhoneId, CellPhone cellPhone);
  int updateCellPhone(int PhoneId, CellPhone cellPhone);
  int deleteCellPhone(int PhoneId);
  List<CellPhone> queryCellPhones();
  Optional<CellPhone> queryCellPhone(int PhoneId);
}