package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzjh implements com.google.android.gms.internal.measurement.zzjd {
    private final java.util.concurrent.atomic.AtomicBoolean zza;
    private java.util.HashMap zzb;
    private final java.util.HashMap zzc;
    private final java.util.HashMap zzd;
    private final java.util.HashMap zze;
    private final java.util.HashMap zzf;
    private java.lang.Object zzg;
    private boolean zzh;
    private final java.lang.String[] zzi;

    public zzjh() {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r4.zza = r0
            r0 = 0
            r4.zzb = r0
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 16
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r3)
            r4.zzc = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r2, r3)
            r4.zzd = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r2, r3)
            r4.zze = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r2, r3)
            r4.zzf = r1
            r4.zzg = r0
            r0 = 0
            r4.zzh = r0
            java.lang.String[] r0 = new java.lang.String[r0]
            r4.zzi = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzb(com.google.android.gms.internal.measurement.zzjh r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final java.lang.String zza(android.content.ContentResolver r10, java.lang.String r11, java.lang.String r12) {
            r9 = this;
            if (r10 == 0) goto Le8
            monitor-enter(r9)
            java.util.HashMap r12 = r9.zzb     // Catch: java.lang.Throwable -> Le5
            r0 = 1
            r1 = 0
            r2 = 0
            if (r12 != 0) goto L2c
            java.util.concurrent.atomic.AtomicBoolean r12 = r9.zza     // Catch: java.lang.Throwable -> Le5
            r12.set(r1)     // Catch: java.lang.Throwable -> Le5
            java.util.HashMap r12 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le5
            r3 = 16
            r4 = 1065353216(0x3f800000, float:1.0)
            r12.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le5
            r9.zzb = r12     // Catch: java.lang.Throwable -> Le5
            java.lang.Object r12 = new java.lang.Object     // Catch: java.lang.Throwable -> Le5
            r12.<init>()     // Catch: java.lang.Throwable -> Le5
            r9.zzg = r12     // Catch: java.lang.Throwable -> Le5
            android.net.Uri r12 = com.google.android.gms.internal.measurement.zzjc.zza     // Catch: java.lang.Throwable -> Le5
            com.google.android.gms.internal.measurement.zzjf r3 = new com.google.android.gms.internal.measurement.zzjf     // Catch: java.lang.Throwable -> Le5
            r3.<init>(r9, r2)     // Catch: java.lang.Throwable -> Le5
            r10.registerContentObserver(r12, r0, r3)     // Catch: java.lang.Throwable -> Le5
            goto L56
        L2c:
            java.util.concurrent.atomic.AtomicBoolean r12 = r9.zza     // Catch: java.lang.Throwable -> Le5
            boolean r12 = r12.getAndSet(r1)     // Catch: java.lang.Throwable -> Le5
            if (r12 == 0) goto L56
            java.util.HashMap r12 = r9.zzb     // Catch: java.lang.Throwable -> Le5
            r12.clear()     // Catch: java.lang.Throwable -> Le5
            java.util.HashMap r12 = r9.zzc     // Catch: java.lang.Throwable -> Le5
            r12.clear()     // Catch: java.lang.Throwable -> Le5
            java.util.HashMap r12 = r9.zzd     // Catch: java.lang.Throwable -> Le5
            r12.clear()     // Catch: java.lang.Throwable -> Le5
            java.util.HashMap r12 = r9.zze     // Catch: java.lang.Throwable -> Le5
            r12.clear()     // Catch: java.lang.Throwable -> Le5
            java.util.HashMap r12 = r9.zzf     // Catch: java.lang.Throwable -> Le5
            r12.clear()     // Catch: java.lang.Throwable -> Le5
            java.lang.Object r12 = new java.lang.Object     // Catch: java.lang.Throwable -> Le5
            r12.<init>()     // Catch: java.lang.Throwable -> Le5
            r9.zzg = r12     // Catch: java.lang.Throwable -> Le5
            r9.zzh = r1     // Catch: java.lang.Throwable -> Le5
        L56:
            java.lang.Object r12 = r9.zzg     // Catch: java.lang.Throwable -> Le5
            java.util.HashMap r3 = r9.zzb     // Catch: java.lang.Throwable -> Le5
            boolean r3 = r3.containsKey(r11)     // Catch: java.lang.Throwable -> Le5
            if (r3 == 0) goto L6e
            java.util.HashMap r10 = r9.zzb     // Catch: java.lang.Throwable -> Le5
            java.lang.Object r10 = r10.get(r11)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Le5
            if (r10 != 0) goto L6b
            goto L6c
        L6b:
            r2 = r10
        L6c:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Le5
            return r2
        L6e:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Le5
            android.net.Uri r4 = com.google.android.gms.internal.measurement.zzjc.zza     // Catch: com.google.android.gms.internal.measurement.zzjg -> Le4
            android.content.ContentProviderClient r10 = r10.acquireUnstableContentProviderClient(r4)     // Catch: com.google.android.gms.internal.measurement.zzjg -> Le4
            if (r10 == 0) goto Ldc
            r5 = 0
            r6 = 0
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lcd android.os.RemoteException -> Lcf
            r7[r1] = r11     // Catch: java.lang.Throwable -> Lcd android.os.RemoteException -> Lcf
            r8 = 0
            r3 = r10
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lcd android.os.RemoteException -> Lcf
            if (r1 == 0) goto Lba
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> Lb8
            if (r3 == 0) goto L96
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> Lb8
            r1.close()     // Catch: java.lang.Throwable -> Lcd android.os.RemoteException -> Lcf
            r10.release()     // Catch: com.google.android.gms.internal.measurement.zzjg -> Le4
            goto L9d
        L96:
            r1.close()     // Catch: java.lang.Throwable -> Lcd android.os.RemoteException -> Lcf
            r10.release()     // Catch: com.google.android.gms.internal.measurement.zzjg -> Le4
            r0 = r2
        L9d:
            if (r0 == 0) goto La6
            boolean r10 = r0.equals(r2)
            if (r10 == 0) goto La6
            r0 = r2
        La6:
            monitor-enter(r9)
            java.lang.Object r10 = r9.zzg     // Catch: java.lang.Throwable -> Lb5
            if (r12 != r10) goto Lb0
            java.util.HashMap r10 = r9.zzb     // Catch: java.lang.Throwable -> Lb5
            r10.put(r11, r0)     // Catch: java.lang.Throwable -> Lb5
        Lb0:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto Lb4
            return r0
        Lb4:
            return r2
        Lb5:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb5
            throw r10
        Lb8:
            r11 = move-exception
            goto Lc2
        Lba:
            com.google.android.gms.internal.measurement.zzjg r11 = new com.google.android.gms.internal.measurement.zzjg     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r12 = "ContentProvider query returned null cursor"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb8
            throw r11     // Catch: java.lang.Throwable -> Lb8
        Lc2:
            if (r1 == 0) goto Lcc
            r1.close()     // Catch: java.lang.Throwable -> Lc8
            goto Lcc
        Lc8:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch: java.lang.Throwable -> Lcd android.os.RemoteException -> Lcf
        Lcc:
            throw r11     // Catch: java.lang.Throwable -> Lcd android.os.RemoteException -> Lcf
        Lcd:
            r11 = move-exception
            goto Ld8
        Lcf:
            r11 = move-exception
            com.google.android.gms.internal.measurement.zzjg r12 = new com.google.android.gms.internal.measurement.zzjg     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "ContentProvider query failed"
            r12.<init>(r0, r11)     // Catch: java.lang.Throwable -> Lcd
            throw r12     // Catch: java.lang.Throwable -> Lcd
        Ld8:
            r10.release()     // Catch: com.google.android.gms.internal.measurement.zzjg -> Le4
            throw r11     // Catch: com.google.android.gms.internal.measurement.zzjg -> Le4
        Ldc:
            com.google.android.gms.internal.measurement.zzjg r10 = new com.google.android.gms.internal.measurement.zzjg     // Catch: com.google.android.gms.internal.measurement.zzjg -> Le4
            java.lang.String r11 = "Unable to acquire ContentProviderClient"
            r10.<init>(r11)     // Catch: com.google.android.gms.internal.measurement.zzjg -> Le4
            throw r10     // Catch: com.google.android.gms.internal.measurement.zzjg -> Le4
        Le4:
            return r2
        Le5:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Le5
            throw r10
        Le8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "ContentResolver needed with GservicesDelegateSupplier.init()"
            r10.<init>(r11)
            throw r10
    }
}
