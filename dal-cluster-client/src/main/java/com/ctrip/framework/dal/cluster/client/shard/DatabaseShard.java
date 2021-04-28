package com.ctrip.framework.dal.cluster.client.shard;

import com.ctrip.framework.dal.cluster.client.base.HostSpec;
import com.ctrip.framework.dal.cluster.client.database.Database;
import com.ctrip.framework.dal.cluster.client.shard.read.ReadStrategy;

import java.util.List;

/**
 * @author c7ch23en
 */
public interface DatabaseShard {

    int getShardIndex();

    List<Database> getMasters();

    List<Database> getSlaves();

    ReadStrategy getReadStrategy();

    Database parseFromHostSpec(HostSpec hostSpec);

}
