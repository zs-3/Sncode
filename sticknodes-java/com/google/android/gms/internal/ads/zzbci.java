package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbci extends com.google.android.gms.internal.ads.zzbcm {
    zzbci(int r7, java.lang.String r8, java.lang.Long r9, java.lang.Long r10) {
            r6 = this;
            r1 = 1
            r5 = 0
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ java.lang.Object zza(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = r3.zzl()
            java.lang.Object r1 = r3.zzk()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r0 = r4.optLong(r0, r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = r2.zzl()
            java.lang.String r1 = "com.google.android.gms.ads.flag."
            java.lang.String r0 = r1.concat(r0)
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L21
            java.lang.String r0 = r2.zzl()
            java.lang.String r0 = r1.concat(r0)
            long r0 = r3.getLong(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            goto L27
        L21:
            java.lang.Object r3 = r2.zzk()
            java.lang.Long r3 = (java.lang.Long) r3
        L27:
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(android.content.SharedPreferences r4) {
            r3 = this;
            java.lang.String r0 = r3.zzl()
            java.lang.Object r1 = r3.zzk()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r0 = r4.getLong(r0, r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ void zzd(android.content.SharedPreferences.Editor r4, java.lang.Object r5) {
            r3 = this;
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.String r0 = r3.zzl()
            long r1 = r5.longValue()
            r4.putLong(r0, r1)
            return
    }
}
