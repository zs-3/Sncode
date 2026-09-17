package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@android.annotation.SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
final class zzfwl {
    public static final /* synthetic */ int zzb = 0;
    private static final com.google.android.gms.internal.ads.zzfxd zzc = null;
    private static final android.content.Intent zzd = null;
    final com.google.android.gms.internal.ads.zzfxc zza;
    private final java.lang.String zze;

    static {
            com.google.android.gms.internal.ads.zzfxd r0 = new com.google.android.gms.internal.ads.zzfxd
            java.lang.String r1 = "OverlayDisplayService"
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzfwl.zzc = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE"
            r0.<init>(r1)
            java.lang.String r1 = "com.android.vending"
            android.content.Intent r0 = r0.setPackage(r1)
            com.google.android.gms.internal.ads.zzfwl.zzd = r0
            return
    }

    zzfwl(android.content.Context r8) {
            r7 = this;
            r7.<init>()
            boolean r0 = com.google.android.gms.internal.ads.zzfxf.zza(r8)
            if (r0 == 0) goto L21
            com.google.android.gms.internal.ads.zzfxc r0 = new com.google.android.gms.internal.ads.zzfxc
            android.content.Context r2 = r8.getApplicationContext()
            com.google.android.gms.internal.ads.zzfxd r3 = com.google.android.gms.internal.ads.zzfwl.zzc
            android.content.Intent r5 = com.google.android.gms.internal.ads.zzfwl.zzd
            com.google.android.gms.internal.ads.zzfwh r6 = new com.google.android.gms.internal.ads.zzfwh
            r6.<init>()
            java.lang.String r4 = "OverlayDisplayService"
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7.zza = r0
            goto L24
        L21:
            r0 = 0
            r7.zza = r0
        L24:
            java.lang.String r8 = r8.getPackageName()
            r7.zze = r8
            return
    }

    static /* synthetic */ boolean zzh(java.lang.String r0) {
            boolean r0 = zzk(r0)
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private static void zzi(java.lang.String r1, java.util.function.Consumer r2) {
            boolean r0 = zzk(r1)
            if (r0 != 0) goto L10
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = r1.trim()
            r2.accept(r1)
        L10:
            return
    }

    private static boolean zzj(com.google.android.gms.internal.ads.zzfwq r2, java.lang.String r3, java.util.List r4) {
            java.util.stream.Stream r4 = r4.stream()
            com.google.android.gms.internal.ads.zzfwi r0 = new com.google.android.gms.internal.ads.zzfwi
            r0.<init>()
            boolean r4 = r4.anyMatch(r0)
            if (r4 == 0) goto L11
            r2 = 1
            return r2
        L11:
            com.google.android.gms.internal.ads.zzfxd r4 = com.google.android.gms.internal.ads.zzfwl.zzc
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r4.zza(r3, r1)
            com.google.android.gms.internal.ads.zzfwo r3 = com.google.android.gms.internal.ads.zzfwp.zzc()
            r4 = 8160(0x1fe0, float:1.1435E-41)
            r3.zzb(r4)
            com.google.android.gms.internal.ads.zzfwp r3 = r3.zzc()
            r2.zza(r3)
            return r0
    }

    private static boolean zzk(java.lang.String r0) {
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfyo.zzc(r0)
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            return r0
    }

    final void zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfxc r0 = r3.zza
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzfxd r0 = com.google.android.gms.internal.ads.zzfwl.zzc
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "unbind LMD display overlay service"
            r0.zzc(r2, r1)
            com.google.android.gms.internal.ads.zzfxc r0 = r3.zza
            r0.zzn()
            return
    }

    final void zzb(com.google.android.gms.internal.ads.zzfvs r5, com.google.android.gms.internal.ads.zzfwq r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzfxc r0 = r4.zza
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            com.google.android.gms.internal.ads.zzfxd r5 = com.google.android.gms.internal.ads.zzfwl.zzc
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r0 = "Play Store not found."
            r6[r2] = r0
            java.lang.String r0 = "error: %s"
            r5.zza(r0, r6)
            return
        L14:
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r3 = r5.zzb()
            r0[r2] = r3
            java.lang.String r2 = r5.zza()
            r0[r1] = r2
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken."
            boolean r0 = zzj(r6, r1, r0)
            if (r0 != 0) goto L30
            return
        L30:
            com.google.android.gms.internal.ads.zzfxc r0 = r4.zza
            com.google.android.gms.internal.ads.zzfwb r1 = new com.google.android.gms.internal.ads.zzfwb
            r1.<init>(r4, r5, r6)
            r0.zzi(r1)
            return
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfvs r5, com.google.android.gms.internal.ads.zzfwq r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzfxc r0 = r4.zza     // Catch: android.os.RemoteException -> L3b
            java.util.Objects.requireNonNull(r0)
            android.os.IInterface r0 = r0.zzc()     // Catch: android.os.RemoteException -> L3b
            com.google.android.gms.internal.ads.zzfvc r0 = (com.google.android.gms.internal.ads.zzfvc) r0     // Catch: android.os.RemoteException -> L3b
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.String r1 = r4.zze     // Catch: android.os.RemoteException -> L3b
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.os.RemoteException -> L3b
            r2.<init>()     // Catch: android.os.RemoteException -> L3b
            java.lang.String r3 = "callerPackage"
            r2.putString(r3, r1)     // Catch: android.os.RemoteException -> L3b
            java.lang.String r1 = r5.zzb()     // Catch: android.os.RemoteException -> L3b
            com.google.android.gms.internal.ads.zzfwe r3 = new com.google.android.gms.internal.ads.zzfwe     // Catch: android.os.RemoteException -> L3b
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L3b
            zzi(r1, r3)     // Catch: android.os.RemoteException -> L3b
            java.lang.String r5 = r5.zza()     // Catch: android.os.RemoteException -> L3b
            com.google.android.gms.internal.ads.zzfwf r1 = new com.google.android.gms.internal.ads.zzfwf     // Catch: android.os.RemoteException -> L3b
            r1.<init>(r2)     // Catch: android.os.RemoteException -> L3b
            zzi(r5, r1)     // Catch: android.os.RemoteException -> L3b
            com.google.android.gms.internal.ads.zzfwk r5 = new com.google.android.gms.internal.ads.zzfwk     // Catch: android.os.RemoteException -> L3b
            r5.<init>(r4, r6)     // Catch: android.os.RemoteException -> L3b
            r0.zze(r2, r5)     // Catch: android.os.RemoteException -> L3b
            return
        L3b:
            r5 = move-exception
            java.lang.String r6 = r4.zze
            com.google.android.gms.internal.ads.zzfxd r0 = com.google.android.gms.internal.ads.zzfwl.zzc
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            java.lang.String r6 = "dismiss overlay display from: %s"
            r0.zzb(r5, r6, r1)
            return
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzfwn r8, com.google.android.gms.internal.ads.zzfwq r9) {
            r7 = this;
            r0 = 1
            r1 = 0
            com.google.android.gms.internal.ads.zzfxc r2 = r7.zza     // Catch: android.os.RemoteException -> L89
            java.util.Objects.requireNonNull(r2)
            android.os.IInterface r2 = r2.zzc()     // Catch: android.os.RemoteException -> L89
            com.google.android.gms.internal.ads.zzfvc r2 = (com.google.android.gms.internal.ads.zzfvc) r2     // Catch: android.os.RemoteException -> L89
            if (r2 != 0) goto L10
            return
        L10:
            java.lang.String r3 = r7.zze     // Catch: android.os.RemoteException -> L89
            android.os.Bundle r4 = new android.os.Bundle     // Catch: android.os.RemoteException -> L89
            r4.<init>()     // Catch: android.os.RemoteException -> L89
            java.lang.String r5 = "callerPackage"
            r4.putString(r5, r3)     // Catch: android.os.RemoteException -> L89
            java.lang.String r5 = "windowToken"
            android.os.IBinder r6 = r8.zzf()     // Catch: android.os.RemoteException -> L89
            r4.putBinder(r5, r6)     // Catch: android.os.RemoteException -> L89
            java.lang.String r5 = r8.zzg()     // Catch: android.os.RemoteException -> L89
            com.google.android.gms.internal.ads.zzfwj r6 = new com.google.android.gms.internal.ads.zzfwj     // Catch: android.os.RemoteException -> L89
            r6.<init>(r4)     // Catch: android.os.RemoteException -> L89
            zzi(r5, r6)     // Catch: android.os.RemoteException -> L89
            java.lang.String r5 = "layoutGravity"
            int r6 = r8.zzc()     // Catch: android.os.RemoteException -> L89
            r4.putInt(r5, r6)     // Catch: android.os.RemoteException -> L89
            java.lang.String r5 = "layoutVerticalMargin"
            float r6 = r8.zza()     // Catch: android.os.RemoteException -> L89
            r4.putFloat(r5, r6)     // Catch: android.os.RemoteException -> L89
            java.lang.String r5 = "displayMode"
            r4.putInt(r5, r1)     // Catch: android.os.RemoteException -> L89
            java.lang.String r5 = "triggerMode"
            r4.putInt(r5, r1)     // Catch: android.os.RemoteException -> L89
            java.lang.String r5 = "windowWidthPx"
            int r6 = r8.zze()     // Catch: android.os.RemoteException -> L89
            r4.putInt(r5, r6)     // Catch: android.os.RemoteException -> L89
            com.google.android.gms.internal.ads.zzfvx r5 = new com.google.android.gms.internal.ads.zzfvx     // Catch: android.os.RemoteException -> L89
            r5.<init>(r4)     // Catch: android.os.RemoteException -> L89
            r6 = 0
            zzi(r6, r5)     // Catch: android.os.RemoteException -> L89
            com.google.android.gms.internal.ads.zzfvy r5 = new com.google.android.gms.internal.ads.zzfvy     // Catch: android.os.RemoteException -> L89
            r5.<init>(r4)     // Catch: android.os.RemoteException -> L89
            zzi(r6, r5)     // Catch: android.os.RemoteException -> L89
            java.lang.String r8 = r8.zzh()     // Catch: android.os.RemoteException -> L89
            com.google.android.gms.internal.ads.zzfvz r5 = new com.google.android.gms.internal.ads.zzfvz     // Catch: android.os.RemoteException -> L89
            r5.<init>(r4)     // Catch: android.os.RemoteException -> L89
            zzi(r8, r5)     // Catch: android.os.RemoteException -> L89
            com.google.android.gms.internal.ads.zzfwa r8 = new com.google.android.gms.internal.ads.zzfwa     // Catch: android.os.RemoteException -> L89
            r8.<init>(r4)     // Catch: android.os.RemoteException -> L89
            zzi(r6, r8)     // Catch: android.os.RemoteException -> L89
            java.lang.String r8 = "stableSessionToken"
            r4.putBoolean(r8, r0)     // Catch: android.os.RemoteException -> L89
            com.google.android.gms.internal.ads.zzfwk r8 = new com.google.android.gms.internal.ads.zzfwk     // Catch: android.os.RemoteException -> L89
            r8.<init>(r7, r9)     // Catch: android.os.RemoteException -> L89
            r2.zzf(r3, r4, r8)     // Catch: android.os.RemoteException -> L89
            return
        L89:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzfxd r9 = com.google.android.gms.internal.ads.zzfwl.zzc
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r7.zze
            r0[r1] = r2
            java.lang.String r1 = "show overlay display from: %s"
            r9.zzb(r8, r1, r0)
            return
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzfws r5, int r6, com.google.android.gms.internal.ads.zzfwq r7) {
            r4 = this;
            com.google.android.gms.internal.ads.zzfxc r0 = r4.zza     // Catch: android.os.RemoteException -> L40
            java.util.Objects.requireNonNull(r0)
            android.os.IInterface r0 = r0.zzc()     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.internal.ads.zzfvc r0 = (com.google.android.gms.internal.ads.zzfvc) r0     // Catch: android.os.RemoteException -> L40
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.String r1 = r4.zze     // Catch: android.os.RemoteException -> L40
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.os.RemoteException -> L40
            r2.<init>()     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = "callerPackage"
            r2.putString(r3, r1)     // Catch: android.os.RemoteException -> L40
            java.lang.String r1 = "displayMode"
            r2.putInt(r1, r6)     // Catch: android.os.RemoteException -> L40
            java.lang.String r1 = r5.zzb()     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.internal.ads.zzfvw r3 = new com.google.android.gms.internal.ads.zzfvw     // Catch: android.os.RemoteException -> L40
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L40
            zzi(r1, r3)     // Catch: android.os.RemoteException -> L40
            java.lang.String r5 = r5.zza()     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.internal.ads.zzfwc r1 = new com.google.android.gms.internal.ads.zzfwc     // Catch: android.os.RemoteException -> L40
            r1.<init>(r2)     // Catch: android.os.RemoteException -> L40
            zzi(r5, r1)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.internal.ads.zzfwk r5 = new com.google.android.gms.internal.ads.zzfwk     // Catch: android.os.RemoteException -> L40
            r5.<init>(r4, r7)     // Catch: android.os.RemoteException -> L40
            r0.zzg(r2, r5)     // Catch: android.os.RemoteException -> L40
            return
        L40:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzfxd r7 = com.google.android.gms.internal.ads.zzfwl.zzc
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r1] = r6
            r6 = 1
            java.lang.String r1 = r4.zze
            r0[r6] = r1
            java.lang.String r6 = "switchDisplayMode overlay display to %d from: %s"
            r7.zzb(r5, r6, r0)
            return
    }

    final void zzf(com.google.android.gms.internal.ads.zzfwn r5, com.google.android.gms.internal.ads.zzfwq r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzfxc r0 = r4.zza
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            com.google.android.gms.internal.ads.zzfxd r5 = com.google.android.gms.internal.ads.zzfwl.zzc
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r0 = "Play Store not found."
            r6[r2] = r0
            java.lang.String r0 = "error: %s"
            r5.zza(r0, r6)
            return
        L14:
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r3 = 0
            r0[r2] = r3
            java.lang.String r2 = r5.zzh()
            r0[r1] = r2
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken."
            boolean r0 = zzj(r6, r1, r0)
            if (r0 != 0) goto L2d
            return
        L2d:
            com.google.android.gms.internal.ads.zzfxc r0 = r4.zza
            com.google.android.gms.internal.ads.zzfwg r1 = new com.google.android.gms.internal.ads.zzfwg
            r1.<init>(r4, r5, r6)
            r0.zzi(r1)
            return
    }

    final void zzg(com.google.android.gms.internal.ads.zzfws r5, com.google.android.gms.internal.ads.zzfwq r6, int r7) {
            r4 = this;
            com.google.android.gms.internal.ads.zzfxc r0 = r4.zza
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            com.google.android.gms.internal.ads.zzfxd r5 = com.google.android.gms.internal.ads.zzfwl.zzc
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r7 = "Play Store not found."
            r6[r2] = r7
            java.lang.String r7 = "error: %s"
            r5.zza(r7, r6)
            return
        L14:
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r3 = r5.zzb()
            r0[r2] = r3
            java.lang.String r2 = r5.zza()
            r0[r1] = r2
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken."
            boolean r0 = zzj(r6, r1, r0)
            if (r0 != 0) goto L30
            return
        L30:
            com.google.android.gms.internal.ads.zzfxc r0 = r4.zza
            com.google.android.gms.internal.ads.zzfwd r1 = new com.google.android.gms.internal.ads.zzfwd
            r1.<init>(r4, r5, r7, r6)
            r0.zzi(r1)
            return
    }
}
