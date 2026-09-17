package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzau {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdxb zzb;
    private java.lang.String zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private int zzg;
    private int zzh;
    private android.graphics.PointF zzi;
    private android.graphics.PointF zzj;
    private android.os.Handler zzk;
    private java.lang.Runnable zzl;

    public zzau(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzg = r0
            com.google.android.gms.ads.internal.util.zzah r0 = new com.google.android.gms.ads.internal.util.zzah
            r0.<init>(r1)
            r1.zzl = r0
            r1.zza = r2
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = r2.getScaledTouchSlop()
            r1.zzh = r2
            com.google.android.gms.ads.internal.util.zzbt r2 = com.google.android.gms.ads.internal.zzu.zzt()
            r2.zzb()
            com.google.android.gms.ads.internal.util.zzbt r2 = com.google.android.gms.ads.internal.zzu.zzt()
            android.os.Handler r2 = r2.zza()
            r1.zzk = r2
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzu.zzs()
            com.google.android.gms.internal.ads.zzdxb r2 = r2.zza()
            r1.zzb = r2
            return
    }

    public zzau(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zzc = r2
            return
    }

    private final void zzs(android.content.Context r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "None"
            r2 = 1
            int r1 = zzu(r0, r1, r2)
            java.lang.String r3 = "Shake"
            int r8 = zzu(r0, r3, r2)
            java.lang.String r3 = "Flick"
            int r9 = zzu(r0, r3, r2)
            com.google.android.gms.internal.ads.zzdxb r3 = r10.zzb
            com.google.android.gms.internal.ads.zzdwx r3 = r3.zza()
            int r3 = r3.ordinal()
            if (r3 == r2) goto L2b
            r2 = 2
            if (r3 == r2) goto L29
            r7 = r1
            goto L2c
        L29:
            r7 = r9
            goto L2c
        L2b:
            r7 = r8
        L2c:
            com.google.android.gms.ads.internal.zzu.zzp()
            android.app.AlertDialog$Builder r11 = com.google.android.gms.ads.internal.util.zzt.zzK(r11)
            java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger
            r6.<init>(r7)
            java.lang.String r1 = "Setup gesture"
            r11.setTitle(r1)
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            com.google.android.gms.ads.internal.util.zzap r1 = new com.google.android.gms.ads.internal.util.zzap
            r1.<init>(r6)
            r11.setSingleChoiceItems(r0, r7, r1)
            com.google.android.gms.ads.internal.util.zzaq r0 = new com.google.android.gms.ads.internal.util.zzaq
            r0.<init>(r10)
            java.lang.String r1 = "Dismiss"
            r11.setNegativeButton(r1, r0)
            com.google.android.gms.ads.internal.util.zzar r0 = new com.google.android.gms.ads.internal.util.zzar
            r4 = r0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r1 = "Save"
            r11.setPositiveButton(r1, r0)
            com.google.android.gms.ads.internal.util.zzas r0 = new com.google.android.gms.ads.internal.util.zzas
            r0.<init>(r10)
            r11.setOnCancelListener(r0)
            android.app.AlertDialog r11 = r11.create()
            r11.show()
            return
    }

    private final boolean zzt(float r2, float r3, float r4, float r5) {
            r1 = this;
            android.graphics.PointF r0 = r1.zzi
            float r0 = r0.x
            float r0 = r0 - r2
            float r2 = java.lang.Math.abs(r0)
            int r0 = r1.zzh
            float r0 = (float) r0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L42
            android.graphics.PointF r2 = r1.zzi
            float r2 = r2.y
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r3 = r1.zzh
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L42
            android.graphics.PointF r2 = r1.zzj
            float r2 = r2.x
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            int r3 = r1.zzh
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L42
            android.graphics.PointF r2 = r1.zzj
            float r2 = r2.y
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            int r3 = r1.zzh
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L42
            r2 = 1
            return r2
        L42:
            r2 = 0
            return r2
    }

    private static final int zzu(java.util.List r1, java.lang.String r2, boolean r3) {
            r0 = -1
            if (r3 != 0) goto L4
            return r0
        L4:
            r1.add(r2)
            int r1 = r1.size()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.String r1 = "{Dialog: "
            r0.append(r1)
            java.lang.String r1 = r2.zzc
            r0.append(r1)
            java.lang.String r1 = ",DebugSignal: "
            r0.append(r1)
            java.lang.String r1 = r2.zzf
            r0.append(r1)
            java.lang.String r1 = ",AFMA Version: "
            r0.append(r1)
            java.lang.String r1 = r2.zze
            r0.append(r1)
            java.lang.String r1 = ",Ad Unit ID: "
            r0.append(r1)
            java.lang.String r1 = r2.zzd
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    final /* synthetic */ void zza() {
            r1 = this;
            android.content.Context r0 = r1.zza
            r1.zzs(r0)
            return
    }

    final /* synthetic */ void zzb() {
            r1 = this;
            android.content.Context r0 = r1.zza
            r1.zzs(r0)
            return
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzgfz r5) {
            r4 = this;
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()
            android.content.Context r1 = r4.zza
            java.lang.String r2 = r4.zzd
            java.lang.String r3 = r4.zze
            boolean r0 = r0.zzj(r1, r2, r3)
            if (r0 != 0) goto L1e
            android.content.Context r5 = r4.zza
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()
            java.lang.String r1 = r4.zzd
            java.lang.String r2 = r4.zze
            r0.zzd(r5, r1, r2)
            return
        L1e:
            com.google.android.gms.ads.internal.util.zzan r0 = new com.google.android.gms.ads.internal.util.zzan
            r0.<init>(r4)
            r5.execute(r0)
            return
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzgfz r5) {
            r4 = this;
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()
            android.content.Context r1 = r4.zza
            java.lang.String r2 = r4.zzd
            java.lang.String r3 = r4.zze
            boolean r0 = r0.zzj(r1, r2, r3)
            if (r0 != 0) goto L1e
            android.content.Context r5 = r4.zza
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()
            java.lang.String r1 = r4.zzd
            java.lang.String r2 = r4.zze
            r0.zzd(r5, r1, r2)
            return
        L1e:
            com.google.android.gms.ads.internal.util.zzam r0 = new com.google.android.gms.ads.internal.util.zzam
            r0.<init>(r4)
            r5.execute(r0)
            return
    }

    final /* synthetic */ void zze() {
            r2 = this;
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()
            android.content.Context r1 = r2.zza
            r0.zzc(r1)
            return
    }

    final /* synthetic */ void zzf() {
            r2 = this;
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()
            android.content.Context r1 = r2.zza
            r0.zzc(r1)
            return
    }

    final /* synthetic */ void zzg() {
            r1 = this;
            r0 = 4
            r1.zzg = r0
            r1.zzr()
            return
    }

    final /* synthetic */ void zzh(java.util.concurrent.atomic.AtomicInteger r1, int r2, int r3, int r4, android.content.DialogInterface r5, int r6) {
            r0 = this;
            int r5 = r1.get()
            if (r5 == r2) goto L29
            int r2 = r1.get()
            if (r2 != r3) goto L14
            com.google.android.gms.internal.ads.zzdxb r1 = r0.zzb
            com.google.android.gms.internal.ads.zzdwx r2 = com.google.android.gms.internal.ads.zzdwx.zzb
            r1.zzm(r2)
            goto L29
        L14:
            int r1 = r1.get()
            if (r1 != r4) goto L22
            com.google.android.gms.internal.ads.zzdxb r1 = r0.zzb
            com.google.android.gms.internal.ads.zzdwx r2 = com.google.android.gms.internal.ads.zzdwx.zzc
            r1.zzm(r2)
            goto L29
        L22:
            com.google.android.gms.internal.ads.zzdxb r1 = r0.zzb
            com.google.android.gms.internal.ads.zzdwx r2 = com.google.android.gms.internal.ads.zzdwx.zza
            r1.zzm(r2)
        L29:
            r0.zzr()
            return
    }

    final /* synthetic */ void zzi(java.lang.String r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.SEND"
            r2.<init>(r3)
            java.lang.String r3 = "text/plain"
            android.content.Intent r2 = r2.setType(r3)
            java.lang.String r3 = "android.intent.extra.TEXT"
            android.content.Intent r1 = r2.putExtra(r3, r1)
            java.lang.String r2 = "Share via"
            android.content.Intent r1 = android.content.Intent.createChooser(r1, r2)
            android.content.Context r2 = r0.zza
            com.google.android.gms.ads.internal.util.zzt.zzT(r2, r1)
            return
    }

    final /* synthetic */ void zzj(int r1, int r2, int r3, int r4, int r5, android.content.DialogInterface r6, int r7) {
            r0 = this;
            if (r7 != r1) goto La2
            android.content.Context r1 = r0.zza
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto Le
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            return
        Le:
            java.lang.String r1 = r0.zzc
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "No debug information"
            if (r2 == 0) goto L19
            goto L75
        L19:
            java.lang.String r2 = "\\+"
            java.lang.String r4 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r4)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.zzu.zzp()
            java.util.Map r1 = com.google.android.gms.ads.internal.util.zzt.zzP(r1)
            java.util.Set r4 = r1.keySet()
            java.util.Iterator r4 = r4.iterator()
        L42:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r2.append(r5)
            java.lang.String r6 = " = "
            r2.append(r6)
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r2.append(r5)
            java.lang.String r5 = "\n\n"
            r2.append(r5)
            goto L42
        L65:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L74
            goto L75
        L74:
            r3 = r1
        L75:
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r1 = r0.zza
            android.app.AlertDialog$Builder r1 = com.google.android.gms.ads.internal.util.zzt.zzK(r1)
            r1.setMessage(r3)
            java.lang.String r2 = "Ad Information"
            r1.setTitle(r2)
            com.google.android.gms.ads.internal.util.zzaj r2 = new com.google.android.gms.ads.internal.util.zzaj
            r2.<init>(r0, r3)
            java.lang.String r3 = "Share"
            r1.setPositiveButton(r3, r2)
            com.google.android.gms.ads.internal.util.zzak r2 = new com.google.android.gms.ads.internal.util.zzak
            r2.<init>()
            java.lang.String r3 = "Close"
            r1.setNegativeButton(r3, r2)
            android.app.AlertDialog r1 = r1.create()
            r1.show()
            return
        La2:
            if (r7 != r2) goto Lb4
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.ads.internal.util.zzai r2 = new com.google.android.gms.ads.internal.util.zzai
            r2.<init>(r0)
            r1.execute(r2)
            return
        Lb4:
            if (r7 != r3) goto Lc6
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.ads.internal.util.zzag r2 = new com.google.android.gms.ads.internal.util.zzag
            r2.<init>(r0)
            r1.execute(r2)
            return
        Lc6:
            if (r7 != r4) goto Le6
            com.google.android.gms.internal.ads.zzdxb r1 = r0.zzb
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzcan.zza
            boolean r1 = r1.zzq()
            if (r1 == 0) goto Ldd
            com.google.android.gms.ads.internal.util.zzat r1 = new com.google.android.gms.ads.internal.util.zzat
            r1.<init>(r0)
            r2.execute(r1)
            return
        Ldd:
            com.google.android.gms.ads.internal.util.zzaf r1 = new com.google.android.gms.ads.internal.util.zzaf
            r1.<init>(r0, r2)
            r3.execute(r1)
            return
        Le6:
            if (r7 != r5) goto L105
            com.google.android.gms.internal.ads.zzdxb r1 = r0.zzb
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzcan.zza
            boolean r1 = r1.zzq()
            if (r1 == 0) goto Lfd
            com.google.android.gms.ads.internal.util.zzae r1 = new com.google.android.gms.ads.internal.util.zzae
            r1.<init>(r0)
            r2.execute(r1)
            return
        Lfd:
            com.google.android.gms.ads.internal.util.zzal r1 = new com.google.android.gms.ads.internal.util.zzal
            r1.<init>(r0, r2)
            r3.execute(r1)
        L105:
            return
    }

    final /* synthetic */ void zzk() {
            r7 = this;
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()
            java.lang.String r1 = r7.zzd
            java.lang.String r2 = r7.zze
            java.lang.String r3 = r7.zzf
            boolean r4 = r0.zzm()
            android.content.Context r5 = r7.zza
            boolean r6 = r0.zzj(r5, r1, r2)
            r0.zzh(r6)
            boolean r6 = r0.zzm()
            if (r6 == 0) goto L35
            if (r4 != 0) goto L28
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L28
            r0.zze(r5, r2, r3, r1)
        L28:
            java.lang.String r1 = "Device is linked for debug signals."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)
            r1 = 0
            r2 = 1
            java.lang.String r3 = "The device is successfully linked for troubleshooting."
            r0.zzi(r5, r3, r1, r2)
            return
        L35:
            r0.zzd(r5, r1, r2)
            return
    }

    final /* synthetic */ void zzl() {
            r8 = this;
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()
            android.content.Context r1 = r8.zza
            java.lang.String r2 = r8.zzd
            java.lang.String r3 = r8.zze
            boolean r4 = r0.zzk(r1, r2, r3)
            r5 = 1
            if (r4 != 0) goto L17
            java.lang.String r2 = "In-app preview failed to load because of a system error. Please try again later."
            r0.zzi(r1, r2, r5, r5)
            return
        L17:
            java.lang.String r4 = r0.zza
            java.lang.String r6 = "2"
            boolean r4 = r6.equals(r4)
            r6 = 0
            if (r4 == 0) goto L2d
            java.lang.String r2 = "Creative is not pushed for this device."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            java.lang.String r2 = "There was no creative pushed from DFP to the device."
            r0.zzi(r1, r2, r6, r6)
            return
        L2d:
            java.lang.String r4 = r0.zza
            java.lang.String r7 = "1"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L40
            java.lang.String r4 = "The app is not linked for creative preview."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r4)
            r0.zzd(r1, r2, r3)
            return
        L40:
            java.lang.String r2 = r0.zza
            java.lang.String r3 = "0"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L54
            java.lang.String r2 = "Device is linked for in app preview."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            java.lang.String r2 = "The device is successfully linked for creative preview."
            r0.zzi(r1, r2, r6, r5)
        L54:
            return
    }

    public final void zzm(android.view.MotionEvent r11) {
            r10 = this;
            int r0 = r11.getActionMasked()
            int r1 = r11.getHistorySize()
            int r2 = r11.getPointerCount()
            r3 = 0
            if (r0 != 0) goto L21
            r10.zzg = r3
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r3)
            float r11 = r11.getY(r3)
            r0.<init>(r1, r11)
            r10.zzi = r0
            return
        L21:
            int r4 = r10.zzg
            r5 = -1
            if (r4 != r5) goto L28
            goto L9d
        L28:
            r6 = 5
            r7 = 1
            if (r4 != 0) goto L57
            if (r0 != r6) goto L9d
            r10.zzg = r6
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r7)
            float r11 = r11.getY(r7)
            r0.<init>(r1, r11)
            r10.zzj = r0
            android.os.Handler r11 = r10.zzk
            java.lang.Runnable r0 = r10.zzl
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzeB
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r11.postDelayed(r0, r1)
            return
        L57:
            if (r4 != r6) goto L9d
            r4 = 2
            if (r2 == r4) goto L5d
            goto L94
        L5d:
            if (r0 != r4) goto L9d
            r0 = 0
            r2 = 0
        L61:
            if (r0 >= r1) goto L7c
            float r4 = r11.getHistoricalX(r3, r0)
            float r6 = r11.getHistoricalY(r3, r0)
            float r8 = r11.getHistoricalX(r7, r0)
            float r9 = r11.getHistoricalY(r7, r0)
            boolean r4 = r10.zzt(r4, r6, r8, r9)
            r4 = r4 ^ r7
            r2 = r2 | r4
            int r0 = r0 + 1
            goto L61
        L7c:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r11.getX(r7)
            float r11 = r11.getY(r7)
            boolean r11 = r10.zzt(r0, r1, r3, r11)
            if (r11 == 0) goto L94
            if (r2 == 0) goto L9d
        L94:
            r10.zzg = r5
            android.os.Handler r11 = r10.zzk
            java.lang.Runnable r0 = r10.zzl
            r11.removeCallbacks(r0)
        L9d:
            return
    }

    public final void zzn(java.lang.String r1) {
            r0 = this;
            r0.zzd = r1
            return
    }

    public final void zzo(java.lang.String r1) {
            r0 = this;
            r0.zze = r1
            return
    }

    public final void zzp(java.lang.String r1) {
            r0 = this;
            r0.zzc = r1
            return
    }

    public final void zzq(java.lang.String r1) {
            r0 = this;
            r0.zzf = r1
            return
    }

    public final void zzr() {
            r12 = this;
            android.content.Context r0 = r12.zza     // Catch: android.view.WindowManager.BadTokenException -> L89
            boolean r0 = r0 instanceof android.app.Activity     // Catch: android.view.WindowManager.BadTokenException -> L89
            if (r0 != 0) goto Lc
            java.lang.String r0 = "Can not create dialog without Activity Context"
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r0)     // Catch: android.view.WindowManager.BadTokenException -> L89
            return
        Lc:
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()     // Catch: android.view.WindowManager.BadTokenException -> L89
            java.lang.String r0 = r0.zzb()     // Catch: android.view.WindowManager.BadTokenException -> L89
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: android.view.WindowManager.BadTokenException -> L89
            java.lang.String r1 = "Creative preview (enabled)"
            java.lang.String r2 = "Creative preview"
            r3 = 1
            if (r3 == r0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()     // Catch: android.view.WindowManager.BadTokenException -> L89
            boolean r0 = r0.zzm()     // Catch: android.view.WindowManager.BadTokenException -> L89
            java.lang.String r2 = "Troubleshooting (enabled)"
            java.lang.String r4 = "Troubleshooting"
            if (r3 == r0) goto L30
            r2 = r4
        L30:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: android.view.WindowManager.BadTokenException -> L89
            r0.<init>()     // Catch: android.view.WindowManager.BadTokenException -> L89
            java.lang.String r4 = "Ad information"
            int r7 = zzu(r0, r4, r3)     // Catch: android.view.WindowManager.BadTokenException -> L89
            int r8 = zzu(r0, r1, r3)     // Catch: android.view.WindowManager.BadTokenException -> L89
            int r9 = zzu(r0, r2, r3)     // Catch: android.view.WindowManager.BadTokenException -> L89
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziM     // Catch: android.view.WindowManager.BadTokenException -> L89
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.view.WindowManager.BadTokenException -> L89
            java.lang.Object r1 = r2.zza(r1)     // Catch: android.view.WindowManager.BadTokenException -> L89
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: android.view.WindowManager.BadTokenException -> L89
            boolean r1 = r1.booleanValue()     // Catch: android.view.WindowManager.BadTokenException -> L89
            java.lang.String r2 = "Open ad inspector"
            int r10 = zzu(r0, r2, r1)     // Catch: android.view.WindowManager.BadTokenException -> L89
            java.lang.String r2 = "Ad inspector settings"
            int r11 = zzu(r0, r2, r1)     // Catch: android.view.WindowManager.BadTokenException -> L89
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.view.WindowManager.BadTokenException -> L89
            android.content.Context r1 = r12.zza     // Catch: android.view.WindowManager.BadTokenException -> L89
            android.app.AlertDialog$Builder r1 = com.google.android.gms.ads.internal.util.zzt.zzK(r1)     // Catch: android.view.WindowManager.BadTokenException -> L89
            java.lang.String r2 = "Select a debug mode"
            android.app.AlertDialog$Builder r2 = r1.setTitle(r2)     // Catch: android.view.WindowManager.BadTokenException -> L89
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: android.view.WindowManager.BadTokenException -> L89
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch: android.view.WindowManager.BadTokenException -> L89
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0     // Catch: android.view.WindowManager.BadTokenException -> L89
            com.google.android.gms.ads.internal.util.zzao r3 = new com.google.android.gms.ads.internal.util.zzao     // Catch: android.view.WindowManager.BadTokenException -> L89
            r5 = r3
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: android.view.WindowManager.BadTokenException -> L89
            r2.setItems(r0, r3)     // Catch: android.view.WindowManager.BadTokenException -> L89
            android.app.AlertDialog r0 = r1.create()     // Catch: android.view.WindowManager.BadTokenException -> L89
            r0.show()     // Catch: android.view.WindowManager.BadTokenException -> L89
            return
        L89:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)
            return
    }
}
