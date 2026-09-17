package com.google.android.gms.drive.events;

/* loaded from: classes.dex */
final class zzh extends java.lang.Thread {
    private final /* synthetic */ java.util.concurrent.CountDownLatch zzcn;
    private final /* synthetic */ com.google.android.gms.drive.events.DriveEventService zzco;

    zzh(com.google.android.gms.drive.events.DriveEventService r1, java.util.concurrent.CountDownLatch r2) {
            r0 = this;
            r0.zzco = r1
            r0.zzcn = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r4 = this;
            android.os.Looper.prepare()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.drive.events.DriveEventService r0 = r4.zzco     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.drive.events.DriveEventService$zza r1 = new com.google.android.gms.drive.events.DriveEventService$zza     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.drive.events.DriveEventService r2 = r4.zzco     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L2e
            r0.zzck = r1     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.drive.events.DriveEventService r0 = r4.zzco     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            r0.zzcl = r1     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.CountDownLatch r0 = r4.zzcn     // Catch: java.lang.Throwable -> L2e
            r0.countDown()     // Catch: java.lang.Throwable -> L2e
            android.os.Looper.loop()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.drive.events.DriveEventService r0 = r4.zzco
            java.util.concurrent.CountDownLatch r0 = com.google.android.gms.drive.events.DriveEventService.zzb(r0)
            if (r0 == 0) goto L2d
            com.google.android.gms.drive.events.DriveEventService r0 = r4.zzco
            java.util.concurrent.CountDownLatch r0 = com.google.android.gms.drive.events.DriveEventService.zzb(r0)
            r0.countDown()
        L2d:
            return
        L2e:
            r0 = move-exception
            com.google.android.gms.drive.events.DriveEventService r1 = r4.zzco
            java.util.concurrent.CountDownLatch r1 = com.google.android.gms.drive.events.DriveEventService.zzb(r1)
            if (r1 == 0) goto L40
            com.google.android.gms.drive.events.DriveEventService r1 = r4.zzco
            java.util.concurrent.CountDownLatch r1 = com.google.android.gms.drive.events.DriveEventService.zzb(r1)
            r1.countDown()
        L40:
            throw r0
    }
}
