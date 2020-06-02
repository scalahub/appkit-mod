package org.ergoplatform.restapi.client;

import retrofit2.Call;
import retrofit2.http.*;

public interface UtilsApi {
  /**
   * Convert Pay-To-Public-Key Address to raw representation (hex-encoded serialized curve point)
   * 
   * @param address address to extract public key from (required)
   * @return Call&lt;String&gt;
   */
  @GET("utils/addressToRaw/{address}")
  Call<String> addressToRaw(
          @Path("address") String address
  );

  /**
   * Check address validity
   * 
   * @param address address to check (required)
   * @return Call&lt;AddressValidity&gt;
   */
  @GET("utils/address/{address}")
  Call<AddressValidity> checkAddressValidity(
          @Path("address") String address
  );

  /**
   * Generate Ergo address from hex-encoded ErgoTree
   * 
   * @param ergoTreeHex ErgoTree to derive an address from (required)
   * @return Call&lt;String&gt;
   */
  @GET("utils/ergoTreeToAddress/{ergoTreeHex}")
  Call<String> ergoTreeToAddress(
          @Path("ergoTreeHex") String ergoTreeHex
  );

  /**
   * Get random seed of 32 bytes
   * 
   * @return Call&lt;String&gt;
   */
  @GET("utils/seed")
  Call<String> getRandomSeed();
    

  /**
   * Generate random seed of specified length in bytes
   * 
   * @param length seed length in bytes (required)
   * @return Call&lt;String&gt;
   */
  @GET("utils/seed/{length}")
  Call<String> getRandomSeedWithLength(
          @Path("length") String length
  );

  /**
   * Return Blake2b hash of specified message
   * 
   * @param body  (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("utils/hash/blake2b")
  Call<String> hashBlake2b(
          @retrofit2.http.Body String body
  );

  /**
   * Generate Pay-To-Public-Key address from hex-encoded raw pubkey (secp256k1 serialized point)
   * 
   * @param pubkeyHex public key to get address from (required)
   * @return Call&lt;String&gt;
   */
  @GET("utils/rawToAddress/{pubkeyHex}")
  Call<String> rawToAddress(
          @Path("pubkeyHex") String pubkeyHex
  );

}
