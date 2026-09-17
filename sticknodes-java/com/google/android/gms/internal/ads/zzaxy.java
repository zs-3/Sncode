package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxy extends com.google.android.gms.internal.ads.zzayc {
    public zzaxy(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "19nlSd1PMyXKl1niHXaxZmvGyLnyitkJHQnkLHtPHLj6n1sor4NdBFlTmnlba7BL"
            java.lang.String r3 = "8mLoio5zXFzLNZDTURhMAugjCGrSPBhh3GCaf2t8mPk="
            r6 = 48
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r5 = this;
            com.google.android.gms.internal.ads.zzasm r0 = r5.zzd
            r1 = 3
            r0.zzag(r1)
            java.lang.reflect.Method r0 = r5.zze
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.google.android.gms.internal.ads.zzawo r3 = r5.zza
            android.content.Context r3 = r3.zzb()
            r4 = 0
            r2[r4] = r3
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.google.android.gms.internal.ads.zzasm r2 = r5.zzd
            monitor-enter(r2)
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzasm r0 = r5.zzd     // Catch: java.lang.Throwable -> L32
            r1 = 2
            r0.zzag(r1)     // Catch: java.lang.Throwable -> L32
            goto L30
        L2b:
            com.google.android.gms.internal.ads.zzasm r0 = r5.zzd     // Catch: java.lang.Throwable -> L32
            r0.zzag(r1)     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            throw r0
    }
}
