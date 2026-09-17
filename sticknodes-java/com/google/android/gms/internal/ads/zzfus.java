package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfus {
    private static com.google.android.gms.internal.ads.zzfus zza;
    private final java.lang.String zzb;
    private final android.content.SharedPreferences zzc;

    static {
            return
    }

    private zzfus(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.getPackageName()
            r2.zzb = r0
            java.lang.String r0 = "paid_storage_sp"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.zzc = r3
            return
    }

    static com.google.android.gms.internal.ads.zzfus zzb(android.content.Context r1) {
            com.google.android.gms.internal.ads.zzfus r0 = com.google.android.gms.internal.ads.zzfus.zza
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.ads.zzfus r0 = new com.google.android.gms.internal.ads.zzfus
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzfus.zza = r0
        Lb:
            com.google.android.gms.internal.ads.zzfus r1 = com.google.android.gms.internal.ads.zzfus.zza
            return r1
    }

    final long zza(java.lang.String r3, long r4) {
            r2 = this;
            android.content.SharedPreferences r4 = r2.zzc
            r0 = -1
            long r3 = r4.getLong(r3, r0)
            return r3
    }

    final java.lang.String zzc(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r3 = r1.zzc
            r0 = 0
            java.lang.String r2 = r3.getString(r2, r0)
            return r2
    }

    final void zzd(java.lang.String r5, java.lang.Object r6) throws java.io.IOException {
            r4 = this;
            boolean r0 = r6 instanceof java.lang.String
            java.lang.String r1 = " for app "
            if (r0 == 0) goto L17
            android.content.SharedPreferences r0 = r4.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r6 = (java.lang.String) r6
            android.content.SharedPreferences$Editor r6 = r0.putString(r5, r6)
            boolean r6 = r6.commit()
            goto L61
        L17:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L30
            android.content.SharedPreferences r0 = r4.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.Long r6 = (java.lang.Long) r6
            long r2 = r6.longValue()
            android.content.SharedPreferences$Editor r6 = r0.putLong(r5, r2)
            boolean r6 = r6.commit()
            goto L61
        L30:
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L49
            android.content.SharedPreferences r0 = r4.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            android.content.SharedPreferences$Editor r6 = r0.putBoolean(r5, r6)
            boolean r6 = r6.commit()
            goto L61
        L49:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 == 0) goto L64
            android.content.SharedPreferences r0 = r4.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            android.content.SharedPreferences$Editor r6 = r0.putInt(r5, r6)
            boolean r6 = r6.commit()
        L61:
            if (r6 == 0) goto L8a
            return
        L64:
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r4.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected object class "
            r2.append(r3)
            r2.append(r6)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            java.lang.String r0 = "GpidLifecycleSPHandler"
            android.util.Log.e(r0, r6)
        L8a:
            java.lang.String r6 = r4.zzb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to store "
            r0.append(r2)
            r0.append(r5)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            throw r6
    }

    final void zze(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            android.content.SharedPreferences r0 = r3.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)
            boolean r0 = r0.commit()
            if (r0 == 0) goto L11
            return
        L11:
            java.lang.String r0 = r3.zzb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to remove "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " for app "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r4)
            throw r0
    }

    final boolean zzf(java.lang.String r2, boolean r3) {
            r1 = this;
            android.content.SharedPreferences r3 = r1.zzc
            r0 = 1
            boolean r2 = r3.getBoolean(r2, r0)
            return r2
    }

    final boolean zzg(java.lang.String r2) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.zzc
            boolean r2 = r0.contains(r2)
            return r2
    }
}
