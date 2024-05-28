package com.kemal.productserviceapi.Repository;

import com.kemal.productserviceapi.Model.Product;
import com.kemal.productserviceapi.Model.Recommendtion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendtionRepository extends JpaRepository <Recommendtion,Long> {
}
