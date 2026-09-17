package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbch extends com.google.android.gms.internal.ads.zzbcm {
    zzbch(int r7, java.lang.String r8, java.lang.Integer r9, java.lang.Integer r10) {
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
    public final /* bridge */ /* synthetic */ java.lang.Object zza(org.json.JSONObject r3) {
            r2 = this;
            java.lang.String r0 = r2.zzl()
            java.lang.Object r1 = r2.zzk()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r3 = r3.optInt(r0, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
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
            int r3 = r3.getInt(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L27
        L21:
            java.lang.Object r3 = r2.zzk()
            java.lang.Integer r3 = (java.lang.Integer) r3
        L27:
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(android.content.SharedPreferences r3) {
            r2 = this;
            java.lang.String r0 = r2.zzl()
            java.lang.Object r1 = r2.zzk()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r3 = r3.getInt(r0, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ void zzd(android.content.SharedPreferences.Editor r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r0 = r1.zzl()
            int r3 = r3.intValue()
            r2.putInt(r0, r3)
            return
    }
}
