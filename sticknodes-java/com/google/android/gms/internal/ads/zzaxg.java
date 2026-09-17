package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxg extends com.google.android.gms.internal.ads.zzayc {
    public zzaxg(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "bxhlS+byKsEaHbhXEyi6TD/EqtsG2sd2GfInhSI7yciYukoqPk/w1i7LSDrcmmYr"
            java.lang.String r3 = "gWtAtoadyS/0GQFYvFINsjkt4bRjT5fE+w3tC36yAJU="
            r6 = 24
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private final void zzc() {
            r6 = this;
            com.google.android.gms.internal.ads.zzawo r0 = r6.zza
            com.google.android.gms.ads.identifier.AdvertisingIdClient r0 = r0.zzh()
            if (r0 != 0) goto L9
            goto L5a
        L9:
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = r0.getInfo()     // Catch: java.io.IOException -> L5a
            java.lang.String r1 = r0.getId()     // Catch: java.io.IOException -> L5a
            int r2 = com.google.android.gms.internal.ads.zzawr.zza     // Catch: java.io.IOException -> L5a
            if (r1 == 0) goto L3c
            java.lang.String r2 = "^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"
            boolean r2 = r1.matches(r2)     // Catch: java.io.IOException -> L5a
            if (r2 == 0) goto L3c
            java.util.UUID r1 = java.util.UUID.fromString(r1)     // Catch: java.io.IOException -> L5a
            r2 = 16
            byte[] r2 = new byte[r2]     // Catch: java.io.IOException -> L5a
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r2)     // Catch: java.io.IOException -> L5a
            long r4 = r1.getMostSignificantBits()     // Catch: java.io.IOException -> L5a
            r3.putLong(r4)     // Catch: java.io.IOException -> L5a
            long r4 = r1.getLeastSignificantBits()     // Catch: java.io.IOException -> L5a
            r3.putLong(r4)     // Catch: java.io.IOException -> L5a
            r1 = 1
            java.lang.String r1 = com.google.android.gms.internal.ads.zzatx.zza(r2, r1)     // Catch: java.io.IOException -> L5a
        L3c:
            if (r1 == 0) goto L5a
            com.google.android.gms.internal.ads.zzasm r2 = r6.zzd     // Catch: java.io.IOException -> L5a
            monitor-enter(r2)     // Catch: java.io.IOException -> L5a
            com.google.android.gms.internal.ads.zzasm r3 = r6.zzd     // Catch: java.lang.Throwable -> L57
            r3.zzs(r1)     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzasm r1 = r6.zzd     // Catch: java.lang.Throwable -> L57
            boolean r0 = r0.isLimitAdTrackingEnabled()     // Catch: java.lang.Throwable -> L57
            r1.zzr(r0)     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.internal.ads.zzasm r0 = r6.zzd     // Catch: java.lang.Throwable -> L57
            r1 = 6
            r0.zzab(r1)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            return
        L57:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.io.IOException -> L5a
        L5a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            r1 = this;
            r1.zzk()
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r7 = this;
            com.google.android.gms.internal.ads.zzawo r0 = r7.zza
            boolean r0 = r0.zzq()
            if (r0 != 0) goto L2a
            com.google.android.gms.internal.ads.zzasm r0 = r7.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzasm r1 = r7.zzd     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r2 = r7.zze     // Catch: java.lang.Throwable -> L27
            r3 = 0
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L27
            r5 = 0
            com.google.android.gms.internal.ads.zzawo r6 = r7.zza     // Catch: java.lang.Throwable -> L27
            android.content.Context r6 = r6.zzb()     // Catch: java.lang.Throwable -> L27
            r4[r5] = r6     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L27
            r1.zzs(r2)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
        L2a:
            r7.zzc()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final java.lang.Void zzk() throws java.lang.Exception {
            r2 = this;
            com.google.android.gms.internal.ads.zzawo r0 = r2.zza
            boolean r0 = r0.zzr()
            r1 = 0
            if (r0 == 0) goto Ld
            super.zzk()
            return r1
        Ld:
            com.google.android.gms.internal.ads.zzawo r0 = r2.zza
            boolean r0 = r0.zzq()
            if (r0 == 0) goto L18
            r2.zzc()
        L18:
            return r1
    }
}
