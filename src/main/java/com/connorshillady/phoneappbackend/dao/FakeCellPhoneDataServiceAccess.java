package com.connorshillady.phoneappbackend.dao;

import com.connorshillady.phoneappbackend.model.CellPhone;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("FakeCellPhoneDAO")
public class FakeCellPhoneDataServiceAccess implements CellPhoneDAO {
  
  private static List<CellPhone> cellPhones = new ArrayList<>();
  
  @Override
  public int insertCellPhone(int PhoneId, CellPhone cell) {
    cellPhones.add(new CellPhone(PhoneId, cell.getPRICE(), cell.getBRAND(), cell.getSTORAGE()));
    return 1;
  }
  @Override
  public int updateCellPhone(int PhoneId, CellPhone cellPhone) {
    return queryCellPhone(PhoneId)
        .map(originalCellPhone -> {
          int idx = cellPhones.indexOf(originalCellPhone);
            if (idx > 0) {
              cellPhones.set(idx, cellPhone);
              return 1;
            }
            return 0;
          }).orElse(0);
  }
  @Override
  public int deleteCellPhone(int PhoneId) {
    Optional<CellPhone> cellOptional = queryCellPhone(PhoneId);
    if (cellOptional.isEmpty()) {
      return 0;
    }
    return 0;
  }
  @Override
  public List<CellPhone> queryCellPhones() {
    return cellPhones;
  }
  @Override
  public Optional<CellPhone> queryCellPhone(int PhoneId) {
    return Optional.empty();
  }
}