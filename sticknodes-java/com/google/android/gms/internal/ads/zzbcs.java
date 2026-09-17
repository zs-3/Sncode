package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbcs implements com.google.android.gms.internal.ads.zzbfg {
    final /* synthetic */ android.content.SharedPreferences zza;

    zzbcs(com.google.android.gms.internal.ads.zzbct r1, android.content.SharedPreferences r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final java.lang.Boolean zza(java.lang.String r2, boolean r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.zza     // Catch: java.lang.ClassCastException -> Lb
            boolean r0 = r0.getBoolean(r2, r3)     // Catch: java.lang.ClassCastException -> Lb
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.ClassCastException -> Lb
            return r2
        Lb:
            android.content.SharedPreferences r0 = r1.zza
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = r0.getString(r2, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final java.lang.Double zzb(java.lang.String r3, double r4) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.zza     // Catch: java.lang.ClassCastException -> Ld
            float r1 = (float) r4     // Catch: java.lang.ClassCastException -> Ld
            float r0 = r0.getFloat(r3, r1)     // Catch: java.lang.ClassCastException -> Ld
            double r0 = (double) r0     // Catch: java.lang.ClassCastException -> Ld
            java.lang.Double r3 = java.lang.Double.valueOf(r0)     // Catch: java.lang.ClassCastException -> Ld
            return r3
        Ld:
            android.content.SharedPreferences r0 = r2.zza
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r3 = r0.getString(r3, r4)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final java.lang.Long zzc(java.lang.String r3, long r4) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.zza     // Catch: java.lang.ClassCastException -> Lb
            long r0 = r0.getLong(r3, r4)     // Catch: java.lang.ClassCastException -> Lb
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.ClassCastException -> Lb
            return r3
        Lb:
            android.content.SharedPreferences r0 = r2.zza
            int r5 = (int) r4
            int r3 = r0.getInt(r3, r5)
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final java.lang.String zzd(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.zza
            java.lang.String r2 = r0.getString(r2, r3)
            return r2
    }
}
