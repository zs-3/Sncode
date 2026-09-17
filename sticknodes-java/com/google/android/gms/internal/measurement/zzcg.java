package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzcg implements android.content.SharedPreferences {
    private final java.util.Map zza;
    private final java.util.Set zzb;

    public zzcg() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zzb = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.Map zza(com.google.android.gms.internal.measurement.zzcg r0) {
            java.util.Map r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Set zzb(com.google.android.gms.internal.measurement.zzcg r0) {
            java.util.Set r0 = r0.zzb
            return r0
    }

    private final java.lang.Object zzc(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto L9
            return r2
        L9:
            return r3
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // android.content.SharedPreferences
    public final android.content.SharedPreferences.Editor edit() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzce r0 = new com.google.android.gms.internal.measurement.zzce
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.content.SharedPreferences
    public final java.util.Map getAll() {
            r1 = this;
            java.util.Map r0 = r1.zza
            return r0
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(java.lang.String r1, boolean r2) {
            r0 = this;
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r1 = r0.zzc(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(java.lang.String r1, float r2) {
            r0 = this;
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r1 = r0.zzc(r1, r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            return r1
    }

    @Override // android.content.SharedPreferences
    public final int getInt(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r0.zzc(r1, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    @Override // android.content.SharedPreferences
    public final long getLong(java.lang.String r1, long r2) {
            r0 = this;
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r0.zzc(r1, r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            return r1
    }

    @Override // android.content.SharedPreferences
    public final java.lang.String getString(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.Object r1 = r0.zzc(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set getStringSet(java.lang.String r1, java.util.Set r2) {
            r0 = this;
            java.lang.Object r1 = r0.zzc(r1, r2)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            java.util.Set r0 = r1.zzb
            r0.add(r2)
            return
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            java.util.Set r0 = r1.zzb
            r0.remove(r2)
            return
    }
}
