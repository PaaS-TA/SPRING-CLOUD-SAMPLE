package org.openpaas.paasta.portal.api.two.repository;

import org.openpaas.paasta.portal.api.two.Entity.ServicepackCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository
 * 해당 클래스가 데이터베이스에 접근하는 클래스임을 명시한다.
 * (Spring data JPA)
 *
 * JpaRepository
 * create, read, update, delete, paging 등을 사용 할 수 있는 interface.
 */
@Repository
public interface ServicepackCategoryRepository extends JpaRepository<ServicepackCategory, Integer> {
}
