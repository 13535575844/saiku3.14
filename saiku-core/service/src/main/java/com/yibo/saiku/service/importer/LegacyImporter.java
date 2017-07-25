package com.yibo.saiku.service.importer;


import com.yibo.saiku.repository.IRepositoryManager;

import java.util.List;

public interface LegacyImporter {

    void importUsers();

    void importSchema();

    void importDatasources();

    void importLegacyReports(IRepositoryManager repositoryManager, byte[] bytes);

    List<JujuSource> importJujuDatasources();
}