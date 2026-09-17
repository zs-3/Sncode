package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzce implements android.content.SharedPreferences.Editor {
    boolean zza;
    final java.util.Set zzb;
    final java.util.Map zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcg zzd;

    /* synthetic */ zzce(com.google.android.gms.internal.measurement.zzcg r1, com.google.android.gms.internal.measurement.zzcf r2) {
            r0 = this;
            r0.zzd = r1
            r0.<init>()
            r1 = 0
            r0.zza = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.zzb = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzc = r1
            return
    }

    private final void zza(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            if (r3 == 0) goto L8
            java.util.Map r0 = r1.zzc
            r0.put(r2, r3)
            return
        L8:
            r1.remove(r2)
            return
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
            r0 = this;
            r0.commit()
            return
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor clear() {
            r1 = this;
            r0 = 1
            r1.zza = r0
            return r1
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
            r7 = this;
            boolean r0 = r7.zza
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.measurement.zzcg r0 = r7.zzd
            java.util.Map r0 = com.google.android.gms.internal.measurement.zzcg.zza(r0)
            r0.clear()
        Ld:
            com.google.android.gms.internal.measurement.zzcg r0 = r7.zzd
            java.util.Map r1 = com.google.android.gms.internal.measurement.zzcg.zza(r0)
            java.util.Set r1 = r1.keySet()
            java.util.Set r2 = r7.zzb
            r1.removeAll(r2)
            java.util.Map r1 = r7.zzc
            java.util.Set r3 = r1.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.util.Map r5 = com.google.android.gms.internal.measurement.zzcg.zza(r0)
            java.lang.Object r6 = r4.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r4.getValue()
            r5.put(r6, r4)
            goto L26
        L44:
            java.util.Set r3 = com.google.android.gms.internal.measurement.zzcg.zzb(r0)
            java.util.Iterator r3 = r3.iterator()
        L4c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L74
            java.lang.Object r4 = r3.next()
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r4 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r4
            java.util.Set r5 = r1.keySet()
            com.google.common.collect.Sets$SetView r5 = com.google.common.collect.Sets.union(r2, r5)
            com.google.common.collect.UnmodifiableIterator r5 = r5.iterator()
        L64:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4c
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r4.onSharedPreferenceChanged(r0, r6)
            goto L64
        L74:
            boolean r0 = r7.zza
            if (r0 != 0) goto L87
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L87
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L85
            goto L87
        L85:
            r0 = 0
            return r0
        L87:
            r0 = 1
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putBoolean(java.lang.String r1, boolean r2) {
            r0 = this;
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.zza(r1, r2)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putFloat(java.lang.String r1, float r2) {
            r0 = this;
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.zza(r1, r2)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putInt(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.zza(r1, r2)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putLong(java.lang.String r1, long r2) {
            r0 = this;
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.zza(r1, r2)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putString(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.zza(r1, r2)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putStringSet(java.lang.String r1, java.util.Set r2) {
            r0 = this;
            r0.zza(r1, r2)
            return r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor remove(java.lang.String r2) {
            r1 = this;
            java.util.Set r0 = r1.zzb
            r0.add(r2)
            return r1
    }
}
