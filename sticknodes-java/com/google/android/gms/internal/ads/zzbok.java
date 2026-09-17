package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbok {
    public static final com.google.android.gms.internal.ads.zzboh zza = null;
    public static final com.google.android.gms.internal.ads.zzbof zzb = null;
    private static final java.nio.charset.Charset zzc = null;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.android.gms.internal.ads.zzbok.zzc = r0
            com.google.android.gms.internal.ads.zzboj r0 = new com.google.android.gms.internal.ads.zzboj
            r0.<init>()
            com.google.android.gms.internal.ads.zzbok.zza = r0
            com.google.android.gms.internal.ads.zzboi r0 = new com.google.android.gms.internal.ads.zzboi
            r0.<init>()
            com.google.android.gms.internal.ads.zzbok.zzb = r0
            return
    }

    static /* synthetic */ java.io.InputStream zza(org.json.JSONObject r2) throws org.json.JSONException {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            java.lang.String r2 = r2.toString()
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.zzbok.zzc
            byte[] r2 = r2.getBytes(r1)
            r0.<init>(r2)
            return r0
    }
}
