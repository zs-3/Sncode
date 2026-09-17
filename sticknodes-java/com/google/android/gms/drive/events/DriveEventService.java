package com.google.android.gms.drive.events;

/* loaded from: classes.dex */
public class DriveEventService extends android.app.Service implements com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.drive.events.CompletionListener, com.google.android.gms.drive.events.zzd, com.google.android.gms.drive.events.zzi {
    public static final java.lang.String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = null;
    private final java.lang.String name;
    private java.util.concurrent.CountDownLatch zzcj;

    @com.google.android.gms.common.util.VisibleForTesting
    com.google.android.gms.drive.events.DriveEventService.zza zzck;
    boolean zzcl;

    @com.google.android.gms.common.util.VisibleForTesting
    private int zzcm;

    static final class zza extends com.google.android.gms.internal.drive.zzir {
        private final java.lang.ref.WeakReference<com.google.android.gms.drive.events.DriveEventService> zzcp;

        private zza(com.google.android.gms.drive.events.DriveEventService r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.zzcp = r0
                return
        }

        /* synthetic */ zza(com.google.android.gms.drive.events.DriveEventService r1, com.google.android.gms.drive.events.zzh r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ android.os.Message zza(com.google.android.gms.drive.events.DriveEventService.zza r0) {
                android.os.Message r0 = r0.zzy()
                return r0
        }

        static /* synthetic */ android.os.Message zza(com.google.android.gms.drive.events.DriveEventService.zza r0, com.google.android.gms.internal.drive.zzfp r1) {
                android.os.Message r0 = r0.zzb(r1)
                return r0
        }

        private final android.os.Message zzb(com.google.android.gms.internal.drive.zzfp r2) {
                r1 = this;
                r0 = 1
                android.os.Message r2 = r1.obtainMessage(r0, r2)
                return r2
        }

        private final android.os.Message zzy() {
                r1 = this;
                r0 = 2
                android.os.Message r0 = r1.obtainMessage(r0)
                return r0
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 1
                if (r0 == r1) goto L27
                r2 = 2
                if (r0 == r2) goto L1f
                com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.drive.events.DriveEventService.zzx()
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r4 = r4.what
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1[r2] = r4
                java.lang.String r4 = "DriveEventService"
                java.lang.String r2 = "Unexpected message type: %s"
                r0.wfmt(r4, r2, r1)
                return
            L1f:
                android.os.Looper r4 = r3.getLooper()
                r4.quit()
                return
            L27:
                java.lang.ref.WeakReference<com.google.android.gms.drive.events.DriveEventService> r0 = r3.zzcp
                java.lang.Object r0 = r0.get()
                com.google.android.gms.drive.events.DriveEventService r0 = (com.google.android.gms.drive.events.DriveEventService) r0
                if (r0 == 0) goto L39
                java.lang.Object r4 = r4.obj
                com.google.android.gms.internal.drive.zzfp r4 = (com.google.android.gms.internal.drive.zzfp) r4
                com.google.android.gms.drive.events.DriveEventService.zza(r0, r4)
                return
            L39:
                android.os.Looper r4 = r3.getLooper()
                r4.quit()
                return
        }
    }

    @com.google.android.gms.common.util.VisibleForTesting
    final class zzb extends com.google.android.gms.internal.drive.zzet {
        private final /* synthetic */ com.google.android.gms.drive.events.DriveEventService zzco;

        private zzb(com.google.android.gms.drive.events.DriveEventService r1) {
                r0 = this;
                r0.zzco = r1
                r0.<init>()
                return
        }

        /* synthetic */ zzb(com.google.android.gms.drive.events.DriveEventService r1, com.google.android.gms.drive.events.zzh r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzes
        public final void zzc(com.google.android.gms.internal.drive.zzfp r4) throws android.os.RemoteException {
                r3 = this;
                com.google.android.gms.drive.events.DriveEventService r0 = r3.zzco
                monitor-enter(r0)
                com.google.android.gms.drive.events.DriveEventService r1 = r3.zzco     // Catch: java.lang.Throwable -> L27
                com.google.android.gms.drive.events.DriveEventService.zza(r1)     // Catch: java.lang.Throwable -> L27
                com.google.android.gms.drive.events.DriveEventService r1 = r3.zzco     // Catch: java.lang.Throwable -> L27
                com.google.android.gms.drive.events.DriveEventService$zza r1 = r1.zzck     // Catch: java.lang.Throwable -> L27
                if (r1 == 0) goto L1a
                android.os.Message r4 = com.google.android.gms.drive.events.DriveEventService.zza.zza(r1, r4)     // Catch: java.lang.Throwable -> L27
                com.google.android.gms.drive.events.DriveEventService r1 = r3.zzco     // Catch: java.lang.Throwable -> L27
                com.google.android.gms.drive.events.DriveEventService$zza r1 = r1.zzck     // Catch: java.lang.Throwable -> L27
                r1.sendMessage(r4)     // Catch: java.lang.Throwable -> L27
                goto L25
            L1a:
                com.google.android.gms.common.internal.GmsLogger r4 = com.google.android.gms.drive.events.DriveEventService.zzx()     // Catch: java.lang.Throwable -> L27
                java.lang.String r1 = "DriveEventService"
                java.lang.String r2 = "Receiving event before initialize is completed."
                r4.e(r1, r2)     // Catch: java.lang.Throwable -> L27
            L25:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                return
            L27:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                throw r4
        }
    }

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "DriveEventService"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.android.gms.drive.events.DriveEventService.zzbz = r0
            return
    }

    protected DriveEventService() {
            r1 = this;
            java.lang.String r0 = "DriveEventService"
            r1.<init>(r0)
            return
    }

    protected DriveEventService(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzcl = r0
            r0 = -1
            r1.zzcm = r0
            r1.name = r2
            return
    }

    static /* synthetic */ void zza(com.google.android.gms.drive.events.DriveEventService r0) throws java.lang.SecurityException {
            r0.zzw()
            return
    }

    static /* synthetic */ void zza(com.google.android.gms.drive.events.DriveEventService r0, com.google.android.gms.internal.drive.zzfp r1) {
            r0.zza(r1)
            return
    }

    private final void zza(com.google.android.gms.internal.drive.zzfp r8) {
            r7 = this;
            java.lang.String r0 = "DriveEventService"
            com.google.android.gms.drive.events.DriveEvent r8 = r8.zzat()
            r1 = 0
            r2 = 1
            int r3 = r8.getType()     // Catch: java.lang.Exception -> L47
            if (r3 == r2) goto L41
            r4 = 2
            if (r3 == r4) goto L3b
            r5 = 4
            if (r3 == r5) goto L35
            r5 = 7
            if (r3 == r5) goto L23
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.drive.events.DriveEventService.zzbz     // Catch: java.lang.Exception -> L47
            java.lang.String r4 = "Unhandled event: %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L47
            r5[r1] = r8     // Catch: java.lang.Exception -> L47
            r3.wfmt(r0, r4, r5)     // Catch: java.lang.Exception -> L47
            return
        L23:
            com.google.android.gms.drive.events.zzv r8 = (com.google.android.gms.drive.events.zzv) r8     // Catch: java.lang.Exception -> L47
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.drive.events.DriveEventService.zzbz     // Catch: java.lang.Exception -> L47
            java.lang.String r5 = "Unhandled transfer state event in %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L47
            java.lang.String r6 = r7.name     // Catch: java.lang.Exception -> L47
            r4[r1] = r6     // Catch: java.lang.Exception -> L47
            r4[r2] = r8     // Catch: java.lang.Exception -> L47
            r3.wfmt(r0, r5, r4)     // Catch: java.lang.Exception -> L47
            return
        L35:
            com.google.android.gms.drive.events.zzb r8 = (com.google.android.gms.drive.events.zzb) r8     // Catch: java.lang.Exception -> L47
            r7.zza(r8)     // Catch: java.lang.Exception -> L47
            return
        L3b:
            com.google.android.gms.drive.events.CompletionEvent r8 = (com.google.android.gms.drive.events.CompletionEvent) r8     // Catch: java.lang.Exception -> L47
            r7.onCompletion(r8)     // Catch: java.lang.Exception -> L47
            return
        L41:
            com.google.android.gms.drive.events.ChangeEvent r8 = (com.google.android.gms.drive.events.ChangeEvent) r8     // Catch: java.lang.Exception -> L47
            r7.onChange(r8)     // Catch: java.lang.Exception -> L47
            return
        L47:
            r8 = move-exception
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.drive.events.DriveEventService.zzbz
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r7.name
            r2[r1] = r4
            java.lang.String r1 = "Error handling event in %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r3.e(r0, r1, r8)
            return
    }

    static /* synthetic */ java.util.concurrent.CountDownLatch zzb(com.google.android.gms.drive.events.DriveEventService r0) {
            java.util.concurrent.CountDownLatch r0 = r0.zzcj
            return r0
    }

    private final void zzw() throws java.lang.SecurityException {
            r2 = this;
            int r0 = r2.getCallingUid()
            int r1 = r2.zzcm
            if (r0 != r1) goto L9
            return
        L9:
            boolean r1 = com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(r2, r0)
            if (r1 == 0) goto L12
            r2.zzcm = r0
            return
        L12:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Caller is not GooglePlayServices"
            r0.<init>(r1)
            throw r0
    }

    static /* synthetic */ com.google.android.gms.common.internal.GmsLogger zzx() {
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.drive.events.DriveEventService.zzbz
            return r0
    }

    @com.google.android.gms.common.util.VisibleForTesting
    protected int getCallingUid() {
            r1 = this;
            int r0 = android.os.Binder.getCallingUid()
            return r0
    }

    @Override // android.app.Service
    public final synchronized android.os.IBinder onBind(android.content.Intent r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "com.google.android.gms.drive.events.HANDLE_EVENT"
            java.lang.String r5 = r5.getAction()     // Catch: java.lang.Throwable -> L57
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Throwable -> L57
            r0 = 0
            if (r5 == 0) goto L55
            com.google.android.gms.drive.events.DriveEventService$zza r5 = r4.zzck     // Catch: java.lang.Throwable -> L57
            if (r5 != 0) goto L4a
            boolean r5 = r4.zzcl     // Catch: java.lang.Throwable -> L57
            if (r5 != 0) goto L4a
            r5 = 1
            r4.zzcl = r5     // Catch: java.lang.Throwable -> L57
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L57
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L57
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L57
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L57
            r4.zzcj = r2     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.drive.events.zzh r5 = new com.google.android.gms.drive.events.zzh     // Catch: java.lang.Throwable -> L57
            r5.<init>(r4, r1)     // Catch: java.lang.Throwable -> L57
            r5.start()     // Catch: java.lang.Throwable -> L57
            r2 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L41 java.lang.Throwable -> L57
            boolean r5 = r1.await(r2, r5)     // Catch: java.lang.InterruptedException -> L41 java.lang.Throwable -> L57
            if (r5 != 0) goto L4a
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.android.gms.drive.events.DriveEventService.zzbz     // Catch: java.lang.InterruptedException -> L41 java.lang.Throwable -> L57
            java.lang.String r1 = "DriveEventService"
            java.lang.String r2 = "Failed to synchronously initialize event handler."
            r5.e(r1, r2)     // Catch: java.lang.InterruptedException -> L41 java.lang.Throwable -> L57
            goto L4a
        L41:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "Unable to start event handler"
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        L4a:
            com.google.android.gms.drive.events.DriveEventService$zzb r5 = new com.google.android.gms.drive.events.DriveEventService$zzb     // Catch: java.lang.Throwable -> L57
            r5.<init>(r4, r0)     // Catch: java.lang.Throwable -> L57
            android.os.IBinder r5 = r5.asBinder()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r4)
            return r5
        L55:
            monitor-exit(r4)
            return r0
        L57:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @Override // com.google.android.gms.drive.events.ChangeListener
    public void onChange(com.google.android.gms.drive.events.ChangeEvent r5) {
            r4 = this;
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.drive.events.DriveEventService.zzbz
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r4.name
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "DriveEventService"
            java.lang.String r2 = "Unhandled change event in %s: %s"
            r0.wfmt(r5, r2, r1)
            return
    }

    @Override // com.google.android.gms.drive.events.CompletionListener
    public void onCompletion(com.google.android.gms.drive.events.CompletionEvent r5) {
            r4 = this;
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.drive.events.DriveEventService.zzbz
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r4.name
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "DriveEventService"
            java.lang.String r2 = "Unhandled completion event in %s: %s"
            r0.wfmt(r5, r2, r1)
            return
    }

    @Override // android.app.Service
    public synchronized void onDestroy() {
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.drive.events.DriveEventService$zza r0 = r5.zzck     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L28
            android.os.Message r0 = com.google.android.gms.drive.events.DriveEventService.zza.zza(r0)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.drive.events.DriveEventService$zza r1 = r5.zzck     // Catch: java.lang.Throwable -> L2d
            r1.sendMessage(r0)     // Catch: java.lang.Throwable -> L2d
            r0 = 0
            r5.zzck = r0     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.CountDownLatch r1 = r5.zzcj     // Catch: java.lang.InterruptedException -> L26 java.lang.Throwable -> L2d
            r2 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L26 java.lang.Throwable -> L2d
            boolean r1 = r1.await(r2, r4)     // Catch: java.lang.InterruptedException -> L26 java.lang.Throwable -> L2d
            if (r1 != 0) goto L26
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.android.gms.drive.events.DriveEventService.zzbz     // Catch: java.lang.InterruptedException -> L26 java.lang.Throwable -> L2d
            java.lang.String r2 = "DriveEventService"
            java.lang.String r3 = "Failed to synchronously quit event handler. Will quit itself"
            r1.w(r2, r3)     // Catch: java.lang.InterruptedException -> L26 java.lang.Throwable -> L2d
        L26:
            r5.zzcj = r0     // Catch: java.lang.Throwable -> L2d
        L28:
            super.onDestroy()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return
        L2d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.google.android.gms.drive.events.zzd
    @com.google.android.gms.common.internal.ShowFirstParty
    public final void zza(com.google.android.gms.drive.events.zzb r5) {
            r4 = this;
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.drive.events.DriveEventService.zzbz
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r4.name
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "DriveEventService"
            java.lang.String r2 = "Unhandled changes available event in %s: %s"
            r0.wfmt(r5, r2, r1)
            return
    }
}
