package org.ergoplatform.explorer.client;

import org.ergoplatform.explorer.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.ergoplatform.explorer.client.model.InlineResponse200;
import org.ergoplatform.explorer.client.model.InlineResponse2001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BlocksApi {
  /**
   * Get block by d
   * 
   * @param d big integer in decimal representation (required)
   * @return Call&lt;InlineResponse2001&gt;
   */
  @GET("blocks/byD/{d}")
  Call<InlineResponse2001> blocksByDDGet(
          @Path("d") Integer d
  );

  /**
   * Get block by id
   * 
   * @param id  (required)
   * @return Call&lt;InlineResponse2001&gt;
   */
  @GET("blocks/{id}")
  Call<InlineResponse2001> blocksIdGet(
          @Path("id") String id
  );

  /**
   * Get list of blocks
   * Get list of blocks sorted by height
   * @param offset Offset (optional)
   * @param limit Limit (optional)
   * @param sortBy Sorted column (optional)
   * @param sortDirection Sort direction (optional)
   * @param startDate Start Date (optional)
   * @param endDate End Date (optional)
   * @return Call&lt;InlineResponse200&gt;
   */
  @GET("blocks")
  Call<InlineResponse200> listBlocks(
          @Query("offset") Integer offset, @Query("limit") Integer limit, @Query("sortBy") String sortBy, @Query("sortDirection") String sortDirection, @Query("startDate") Integer startDate, @Query("endDate") Integer endDate
  );

}
