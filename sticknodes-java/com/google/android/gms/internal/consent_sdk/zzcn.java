package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzcn {
    private final android.content.Context zza;
    private final java.util.Map zzb;

    public zzcn(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            r1.zza = r2
            return
    }

    static /* bridge */ /* synthetic */ android.content.SharedPreferences.Editor zza(com.google.android.gms.internal.consent_sdk.zzcn r0, java.lang.String r1) {
            android.content.SharedPreferences$Editor r0 = r0.zzd(r1)
            return r0
    }

    private final android.content.SharedPreferences.Editor zzd(java.lang.String r4) {
            r3 = this;
            java.util.Map r0 = r3.zzb
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L18
            java.util.Map r0 = r3.zzb
            android.content.Context r1 = r3.zza
            r2 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r4, r2)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r0.put(r4, r1)
        L18:
            java.util.Map r0 = r3.zzb
            java.lang.Object r4 = r0.get(r4)
            android.content.SharedPreferences$Editor r4 = (android.content.SharedPreferences.Editor) r4
            return r4
    }

    public final void zzb() {
            r2 = this;
            java.util.Map r0 = r2.zzb
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            android.content.SharedPreferences$Editor r1 = (android.content.SharedPreferences.Editor) r1
            r1.apply()
            goto La
        L1a:
            return
    }

    public final boolean zzc(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            android.content.Context r0 = r4.zza
            com.google.android.gms.internal.consent_sdk.zzcm r5 = com.google.android.gms.internal.consent_sdk.zzco.zza(r0, r5)
            r0 = 0
            if (r5 != 0) goto La
            return r0
        La:
            java.lang.String r1 = r5.zza
            android.content.SharedPreferences$Editor r1 = r4.zzd(r1)
            boolean r2 = r6 instanceof java.lang.Integer
            if (r2 == 0) goto L20
            java.lang.String r5 = r5.zzb
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1.putInt(r5, r6)
            goto L6b
        L20:
            boolean r2 = r6 instanceof java.lang.Long
            if (r2 == 0) goto L30
            java.lang.String r5 = r5.zzb
            java.lang.Long r6 = (java.lang.Long) r6
            long r2 = r6.longValue()
            r1.putLong(r5, r2)
            goto L6b
        L30:
            boolean r2 = r6 instanceof java.lang.Double
            if (r2 == 0) goto L40
            java.lang.String r5 = r5.zzb
            java.lang.Double r6 = (java.lang.Double) r6
            float r6 = r6.floatValue()
            r1.putFloat(r5, r6)
            goto L6b
        L40:
            boolean r2 = r6 instanceof java.lang.Float
            if (r2 == 0) goto L50
            java.lang.String r5 = r5.zzb
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r1.putFloat(r5, r6)
            goto L6b
        L50:
            boolean r2 = r6 instanceof java.lang.Boolean
            if (r2 == 0) goto L60
            java.lang.String r5 = r5.zzb
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r1.putBoolean(r5, r6)
            goto L6b
        L60:
            boolean r2 = r6 instanceof java.lang.String
            if (r2 == 0) goto L6d
            java.lang.String r5 = r5.zzb
            java.lang.String r6 = (java.lang.String) r6
            r1.putString(r5, r6)
        L6b:
            r5 = 1
            return r5
        L6d:
            return r0
    }
}
