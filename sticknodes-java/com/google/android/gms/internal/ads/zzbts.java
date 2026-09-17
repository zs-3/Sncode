package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbts {
    public final boolean zza;
    public final java.lang.String zzb;
    public final boolean zzc;

    public zzbts(boolean r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzbts zza(org.json.JSONObject r4) {
            java.lang.String r0 = "enable_prewarming"
            r1 = 0
            boolean r0 = r4.optBoolean(r0, r1)
            java.lang.String r2 = "prefetch_url"
            java.lang.String r3 = ""
            java.lang.String r2 = r4.optString(r2, r3)
            java.lang.String r3 = "skip_offline_notification_flow"
            boolean r4 = r4.optBoolean(r3, r1)
            com.google.android.gms.internal.ads.zzbts r1 = new com.google.android.gms.internal.ads.zzbts
            r1.<init>(r0, r2, r4)
            return r1
    }
}
