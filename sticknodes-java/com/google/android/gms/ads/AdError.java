package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class AdError {
    public static final java.lang.String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.ads.AdError zzd;

    public AdError(int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public AdError(int r1, java.lang.String r2, java.lang.String r3, com.google.android.gms.ads.AdError r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public com.google.android.gms.ads.AdError getCause() {
            r1 = this;
            com.google.android.gms.ads.AdError r0 = r1.zzd
            return r0
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public java.lang.String getDomain() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            org.json.JSONObject r0 = r2.zzb()     // Catch: org.json.JSONException -> La
            r1 = 2
            java.lang.String r0 = r0.toString(r1)     // Catch: org.json.JSONException -> La
            goto Lc
        La:
            java.lang.String r0 = "Error forming toString output."
        Lc:
            return r0
    }

    public final com.google.android.gms.ads.internal.client.zze zza() {
            r13 = this;
            com.google.android.gms.ads.AdError r0 = r13.zzd
            if (r0 != 0) goto L6
            r0 = 0
            goto L14
        L6:
            java.lang.String r4 = r0.zzc
            java.lang.String r3 = r0.zzb
            int r2 = r0.zza
            com.google.android.gms.ads.internal.client.zze r0 = new com.google.android.gms.ads.internal.client.zze
            r5 = 0
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        L14:
            r11 = r0
            int r8 = r13.zza
            java.lang.String r9 = r13.zzb
            java.lang.String r10 = r13.zzc
            com.google.android.gms.ads.internal.client.zze r0 = new com.google.android.gms.ads.internal.client.zze
            r12 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            return r0
    }

    public org.json.JSONObject zzb() throws org.json.JSONException {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r3.zza
            java.lang.String r2 = "Code"
            r0.put(r2, r1)
            java.lang.String r1 = r3.zzb
            java.lang.String r2 = "Message"
            r0.put(r2, r1)
            java.lang.String r1 = r3.zzc
            java.lang.String r2 = "Domain"
            r0.put(r2, r1)
            com.google.android.gms.ads.AdError r1 = r3.zzd
            java.lang.String r2 = "Cause"
            if (r1 != 0) goto L26
            java.lang.String r1 = "null"
            r0.put(r2, r1)
            goto L2d
        L26:
            org.json.JSONObject r1 = r1.zzb()
            r0.put(r2, r1)
        L2d:
            return r0
    }
}
