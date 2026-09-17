package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxa extends com.google.android.gms.internal.ads.zzayc {
    public zzaxa(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "yunpg/6VdKt9qYWjYKs5tjKMiKriIKdWWgRCb/dxRRCrip4tXKwty8n3U/lUpwOV"
            java.lang.String r3 = "nCcHhBJ+r5jDr0ERNbOfBIJ/pDQFZIqvHaO2vAiQNRE="
            r6 = 49
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r6 = this;
            com.google.android.gms.internal.ads.zzasm r0 = r6.zzd
            r1 = 3
            r0.zzaa(r1)
            java.lang.reflect.Method r0 = r6.zze     // Catch: java.lang.reflect.InvocationTargetException -> L29
            r1 = 0
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L29
            r4 = 0
            com.google.android.gms.internal.ads.zzawo r5 = r6.zza     // Catch: java.lang.reflect.InvocationTargetException -> L29
            android.content.Context r5 = r5.zzb()     // Catch: java.lang.reflect.InvocationTargetException -> L29
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L29
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L29
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.reflect.InvocationTargetException -> L29
            boolean r0 = r0.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L29
            com.google.android.gms.internal.ads.zzasm r1 = r6.zzd     // Catch: java.lang.reflect.InvocationTargetException -> L29
            if (r2 == r0) goto L24
            goto L25
        L24:
            r2 = 2
        L25:
            r1.zzaa(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L29
            return
        L29:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getTargetException()
            boolean r1 = r1 instanceof android.provider.Settings.SettingNotFoundException
            if (r1 == 0) goto L33
            return
        L33:
            throw r0
    }
}
