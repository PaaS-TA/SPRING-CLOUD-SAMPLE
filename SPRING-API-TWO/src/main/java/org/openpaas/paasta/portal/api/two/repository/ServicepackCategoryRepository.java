package org.openpaas.paasta.portal.api.two.repository;

import org.openpaas.paasta.portal.api.two.Entity.ServicepackCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by indra on 2018-02-06.
 */
@Repository
public interface ServicepackCategoryRepository extends JpaRepository<ServicepackCategory, Integer> {
}
