import com.google.gson.annotations.SerializedName;

public enum bf {
   @SerializedName("OK")
   OK,
   @SerializedName("ERROR")
   ERROR,
   @SerializedName("UPDATE")
   UPDATE,
   @SerializedName("PROXY")
   PROXY,
   @SerializedName("LOGIN")
   LOGIN,
   @SerializedName("PASSWORD")
   PASSWORD,
   @SerializedName("SERVER")
   SERVER,
   @SerializedName("ACTIVE")
   ACTIVE,
   @SerializedName("TWOAUTH")
   TWOAUTH,
   @SerializedName("VIRTUAL")
   VIRTUAL,
   @SerializedName("CODE")
   CODE,
   @SerializedName("UPLOAD")
   UPLOAD,
   @SerializedName("TYPE")
   TYPE,
   @SerializedName("SIZE")
   SIZE,
   @SerializedName("HD")
   HD,
   @SerializedName("INTERNAL")
   INTERNAL;
}
