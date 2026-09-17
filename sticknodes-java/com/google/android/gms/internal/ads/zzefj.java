package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzefj extends com.google.android.gms.internal.ads.zzbte {
    final java.util.Map zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzdud zzc;
    private final com.google.android.gms.ads.internal.util.client.zzr zzd;
    private final com.google.android.gms.internal.ads.zzeey zze;
    private java.lang.String zzf;
    private java.lang.String zzg;

    public zzefj(android.content.Context r2, com.google.android.gms.internal.ads.zzeey r3, com.google.android.gms.ads.internal.util.client.zzr r4, com.google.android.gms.internal.ads.zzdud r5) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r5
            r1.zzd = r4
            r1.zze = r3
            return
    }

    public static void zzc(android.content.Context r6, com.google.android.gms.internal.ads.zzdud r7, com.google.android.gms.internal.ads.zzeey r8, java.lang.String r9, java.lang.String r10) {
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            zzd(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void zzd(android.content.Context r6, com.google.android.gms.internal.ads.zzdud r7, com.google.android.gms.internal.ads.zzeey r8, java.lang.String r9, java.lang.String r10, java.util.Map r11) {
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            boolean r6 = r0.zzA(r6)
            r0 = 1
            if (r0 == r6) goto Le
            java.lang.String r6 = "offline"
            goto L10
        Le:
            java.lang.String r6 = "online"
        L10:
            if (r7 == 0) goto L5f
            com.google.android.gms.internal.ads.zzduc r7 = r7.zza()
            java.lang.String r0 = "gqi"
            r7.zzb(r0, r9)
            java.lang.String r0 = "action"
            r7.zzb(r0, r10)
            java.lang.String r10 = "device_connectivity"
            r7.zzb(r10, r6)
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r6.currentTimeMillis()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r10 = "event_timestamp"
            r7.zzb(r10, r6)
            java.util.Set r6 = r11.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L3e:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L5a
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            r7.zzb(r11, r10)
            goto L3e
        L5a:
            java.lang.String r6 = r7.zze()
            goto L61
        L5f:
            java.lang.String r6 = ""
        L61:
            r4 = r6
            com.google.android.gms.internal.ads.zzefa r6 = new com.google.android.gms.internal.ads.zzefa
            com.google.android.gms.common.util.Clock r7 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r7.currentTimeMillis()
            r5 = 2
            r0 = r6
            r3 = r9
            r0.<init>(r1, r3, r4, r5)
            r8.zzd(r6)
            return
    }

    public static final android.app.PendingIntent zzr(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.setAction(r3)
            java.lang.String r1 = "offline_notification_action"
            r0.putExtra(r1, r3)
            java.lang.String r1 = "gws_query_id"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "uri"
            r0.putExtra(r4, r5)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r1 = 29
            if (r4 < r1) goto L32
            java.lang.String r4 = "offline_notification_clicked"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L32
            java.lang.String r3 = "com.google.android.gms.ads.NotificationHandlerActivity"
            r0.setClassName(r2, r3)
            r3 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r2 = com.google.android.gms.internal.ads.zzfuz.zza(r2, r5, r0, r3)
            return r2
        L32:
            java.lang.String r3 = "com.google.android.gms.ads.AdService"
            r0.setClassName(r2, r3)
            int r3 = com.google.android.gms.internal.ads.zzfuz.zza
            r4 = 1073741824(0x40000000, float:2.0)
            r3 = r3 | r4
            android.app.PendingIntent r2 = com.google.android.gms.internal.ads.zzfuz.zzb(r2, r5, r0, r3, r5)
            return r2
    }

    private final java.lang.String zzs() {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.String r1 = r2.zzf
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzeeq r0 = (com.google.android.gms.internal.ads.zzeeq) r0
            if (r0 != 0) goto Lf
            java.lang.String r0 = ""
            return r0
        Lf:
            java.lang.String r0 = r0.zzb()
            return r0
    }

    private static java.lang.String zzt(int r1, java.lang.String r2) {
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            android.content.res.Resources r0 = r0.zze()
            if (r0 != 0) goto Lb
            return r2
        Lb:
            java.lang.String r1 = r0.getString(r1)
            return r1
    }

    private final void zzu(java.lang.String r7, java.lang.String r8, java.util.Map r9) {
            r6 = this;
            android.content.Context r0 = r6.zzb
            com.google.android.gms.internal.ads.zzdud r1 = r6.zzc
            com.google.android.gms.internal.ads.zzeey r2 = r6.zze
            r3 = r7
            r4 = r8
            r5 = r9
            zzd(r0, r1, r2, r3, r4, r5)
            return
    }

    private final void zzv() {
            r6 = this;
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.os.RemoteException -> L40
            android.content.Context r0 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.ads.internal.util.zzbr r0 = com.google.android.gms.ads.internal.util.zzt.zzz(r0)     // Catch: android.os.RemoteException -> L40
            android.content.Context r1 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.ads.internal.offline.buffering.zza r2 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L40
            java.util.Map r5 = r6.zza     // Catch: android.os.RemoteException -> L40
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.internal.ads.zzeeq r5 = (com.google.android.gms.internal.ads.zzeeq) r5     // Catch: android.os.RemoteException -> L40
            if (r5 != 0) goto L22
            java.lang.String r5 = ""
            goto L26
        L22:
            java.lang.String r5 = r5.zzc()     // Catch: android.os.RemoteException -> L40
        L26:
            r2.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzg(r1, r2)     // Catch: android.os.RemoteException -> L40
            if (r1 != 0) goto L47
            android.content.Context r2 = r6.zzb     // Catch: android.os.RemoteException -> L3e
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L3e
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L3e
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L3e
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L3e
            goto L47
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r0 = move-exception
            r1 = 0
        L42:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
        L47:
            if (r1 != 0) goto L5b
            com.google.android.gms.internal.ads.zzeey r0 = r6.zze
            java.lang.String r1 = r6.zzf
            r0.zzc(r1)
            java.lang.String r0 = r6.zzf
            com.google.android.gms.internal.ads.zzgba r1 = com.google.android.gms.internal.ads.zzgba.zzd()
            java.lang.String r2 = "offline_notification_worker_not_scheduled"
            r6.zzu(r0, r2, r1)
        L5b:
            return
    }

    private final void zzw(android.app.Activity r5, com.google.android.gms.ads.internal.overlay.zzm r6) {
            r4 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            androidx.core.app.NotificationManagerCompat r0 = androidx.core.app.NotificationManagerCompat.from(r5)
            boolean r0 = r0.areNotificationsEnabled()
            if (r0 != 0) goto L7a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L63
            com.google.android.gms.ads.internal.zzu.zzp()
            android.app.AlertDialog$Builder r0 = com.google.android.gms.ads.internal.util.zzt.zzK(r5)
            int r1 = com.google.android.gms.ads.impl.R.string.notifications_permission_title
            java.lang.String r2 = "Allow app to send you notifications?"
            java.lang.String r1 = zzt(r1, r2)
            android.app.AlertDialog$Builder r1 = r0.setTitle(r1)
            int r2 = com.google.android.gms.ads.impl.R.string.notifications_permission_confirm
            java.lang.String r3 = "Allow"
            java.lang.String r2 = zzt(r2, r3)
            com.google.android.gms.internal.ads.zzefc r3 = new com.google.android.gms.internal.ads.zzefc
            r3.<init>(r4, r5, r6)
            android.app.AlertDialog$Builder r5 = r1.setPositiveButton(r2, r3)
            int r1 = com.google.android.gms.ads.impl.R.string.notifications_permission_decline
            java.lang.String r2 = "Don't allow"
            java.lang.String r1 = zzt(r1, r2)
            com.google.android.gms.internal.ads.zzefd r2 = new com.google.android.gms.internal.ads.zzefd
            r2.<init>(r4, r6)
            android.app.AlertDialog$Builder r5 = r5.setNegativeButton(r1, r2)
            com.google.android.gms.internal.ads.zzefe r1 = new com.google.android.gms.internal.ads.zzefe
            r1.<init>(r4, r6)
            r5.setOnCancelListener(r1)
            android.app.AlertDialog r5 = r0.create()
            r5.show()
            java.lang.String r5 = r4.zzf
            com.google.android.gms.internal.ads.zzgba r6 = com.google.android.gms.internal.ads.zzgba.zzd()
            java.lang.String r0 = "rtsdi"
            r4.zzu(r5, r0, r6)
            return
        L63:
            java.lang.String r6 = "android.permission.POST_NOTIFICATIONS"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r0 = 12345(0x3039, float:1.7299E-41)
            r5.requestPermissions(r6, r0)
            java.lang.String r5 = r4.zzf
            com.google.android.gms.internal.ads.zzgba r6 = com.google.android.gms.internal.ads.zzgba.zzd()
            java.lang.String r0 = "asnpdi"
            r4.zzu(r5, r0, r6)
            return
        L7a:
            r4.zzv()
            r4.zzx(r5, r6)
            return
    }

    private final void zzx(android.app.Activity r6, com.google.android.gms.ads.internal.overlay.zzm r7) {
            r5 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            android.app.AlertDialog$Builder r0 = com.google.android.gms.ads.internal.util.zzt.zzK(r6)
            com.google.android.gms.internal.ads.zzefb r1 = new com.google.android.gms.internal.ads.zzefb
            r1.<init>(r7)
            android.app.AlertDialog$Builder r0 = r0.setOnCancelListener(r1)
            int r1 = com.google.android.gms.ads.impl.R.layout.offline_ads_dialog
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
            android.content.res.Resources r2 = r2.zze()
            r3 = 0
            if (r2 != 0) goto L1f
            r1 = r3
            goto L23
        L1f:
            android.content.res.XmlResourceParser r1 = r2.getLayout(r1)
        L23:
            if (r1 != 0) goto L35
            int r6 = com.google.android.gms.ads.impl.R.string.offline_dialog_text
            java.lang.String r1 = "Thanks for your interest.\nWe will share more once you're back online."
            java.lang.String r6 = zzt(r6, r1)
            r0.setMessage(r6)
            android.app.AlertDialog r6 = r0.create()
            goto L87
        L35:
            android.view.LayoutInflater r6 = r6.getLayoutInflater()
            android.view.View r6 = r6.inflate(r1, r3)
            r0.setView(r6)
            java.lang.String r1 = r5.zzs()
            boolean r2 = r1.isEmpty()
            r4 = 0
            if (r2 != 0) goto L59
            int r2 = com.google.android.gms.ads.impl.R.id.offline_dialog_advertiser_name
            android.view.View r2 = r6.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setVisibility(r4)
            r2.setText(r1)
        L59:
            java.util.Map r1 = r5.zza
            java.lang.String r2 = r5.zzf
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.ads.zzeeq r1 = (com.google.android.gms.internal.ads.zzeeq) r1
            if (r1 != 0) goto L66
            goto L6a
        L66:
            android.graphics.drawable.Drawable r3 = r1.zza()
        L6a:
            if (r3 == 0) goto L77
            int r1 = com.google.android.gms.ads.impl.R.id.offline_dialog_image
            android.view.View r6 = r6.findViewById(r1)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageDrawable(r3)
        L77:
            android.app.AlertDialog r6 = r0.create()
            android.view.Window r0 = r6.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r4)
            r0.setBackgroundDrawable(r1)
        L87:
            r6.show()
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            com.google.android.gms.internal.ads.zzefi r1 = new com.google.android.gms.internal.ads.zzefi
            r1.<init>(r5, r6, r0, r7)
            r6 = 3000(0xbb8, double:1.482E-320)
            r0.schedule(r1, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zze(android.content.Intent r11) {
            r10 = this;
            java.lang.String r0 = "olaa"
            java.lang.String r1 = "offline_notification_action"
            java.lang.String r2 = r11.getStringExtra(r1)
            java.lang.String r3 = "offline_notification_clicked"
            boolean r4 = r2.equals(r3)
            java.lang.String r5 = "offline_notification_dismissed"
            if (r4 != 0) goto L1a
            boolean r4 = r2.equals(r5)
            if (r4 == 0) goto L19
            goto L1a
        L19:
            return
        L1a:
            java.lang.String r4 = "gws_query_id"
            java.lang.String r4 = r11.getStringExtra(r4)
            java.lang.String r6 = "uri"
            java.lang.String r11 = r11.getStringExtra(r6)
            android.content.Context r6 = r10.zzb
            com.google.android.gms.internal.ads.zzcad r7 = com.google.android.gms.ads.internal.zzu.zzo()
            boolean r6 = r7.zzA(r6)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            boolean r2 = r2.equals(r3)
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L8e
            r7.put(r1, r3)
            if (r9 == r6) goto L43
            goto L44
        L43:
            r8 = 1
        L44:
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "obvs"
            r7.put(r3, r2)
            java.lang.String r2 = "http"
            boolean r2 = r11.startsWith(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "olaih"
            r7.put(r3, r2)
            android.content.Context r2 = r10.zzb     // Catch: android.content.ActivityNotFoundException -> L88
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.ActivityNotFoundException -> L88
            android.content.Intent r2 = r2.getLaunchIntentForPackage(r11)     // Catch: android.content.ActivityNotFoundException -> L88
            if (r2 != 0) goto L78
            android.content.Intent r2 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L88
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3)     // Catch: android.content.ActivityNotFoundException -> L88
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch: android.content.ActivityNotFoundException -> L88
            r2.setData(r11)     // Catch: android.content.ActivityNotFoundException -> L88
        L78:
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r11)     // Catch: android.content.ActivityNotFoundException -> L88
            android.content.Context r11 = r10.zzb     // Catch: android.content.ActivityNotFoundException -> L88
            r11.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L88
            java.lang.String r11 = "olas"
            r7.put(r0, r11)     // Catch: android.content.ActivityNotFoundException -> L88
            goto L91
        L88:
            java.lang.String r11 = "olaf"
            r7.put(r0, r11)
            goto L91
        L8e:
            r7.put(r1, r5)
        L91:
            r10.zzu(r4, r1, r7)
            com.google.android.gms.internal.ads.zzeey r11 = r10.zze     // Catch: android.database.sqlite.SQLiteException -> La8
            android.database.sqlite.SQLiteDatabase r11 = r11.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> La8
            if (r8 != r9) goto La4
            com.google.android.gms.internal.ads.zzeey r0 = r10.zze
            com.google.android.gms.ads.internal.util.client.zzr r1 = r10.zzd
            r0.zzg(r11, r1, r4)
            return
        La4:
            com.google.android.gms.internal.ads.zzeey.zzi(r11, r4)
            return
        La8:
            r11 = move-exception
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Failed to get writable offline buffering database: "
            java.lang.String r11 = r0.concat(r11)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r11)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzf(java.lang.String[] r4, int[] r5, com.google.android.gms.dynamic.IObjectWrapper r6) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto L47
            r1 = r4[r0]
            java.lang.String r2 = "android.permission.POST_NOTIFICATIONS"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L11
            int r0 = r0 + 1
            goto L1
        L11:
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r6)
            com.google.android.gms.internal.ads.zzefl r4 = (com.google.android.gms.internal.ads.zzefl) r4
            android.app.Activity r6 = r4.zza()
            com.google.android.gms.ads.internal.overlay.zzm r4 = r4.zzb()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r5 = r5[r0]
            java.lang.String r0 = "dialog_action"
            if (r5 != 0) goto L36
            java.lang.String r5 = "confirm"
            r1.put(r0, r5)
            r3.zzv()
            r3.zzx(r6, r4)
            goto L40
        L36:
            java.lang.String r5 = "dismiss"
            r1.put(r0, r5)
            if (r4 == 0) goto L40
            r4.zzb()
        L40:
            java.lang.String r4 = r3.zzf
            java.lang.String r5 = "asnpdc"
            r3.zzu(r4, r5, r1)
        L47:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzg(com.google.android.gms.dynamic.IObjectWrapper r6) {
            r5 = this;
            java.lang.Object r6 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r6)
            com.google.android.gms.internal.ads.zzefl r6 = (com.google.android.gms.internal.ads.zzefl) r6
            android.app.Activity r0 = r6.zza()
            com.google.android.gms.ads.internal.overlay.zzm r1 = r6.zzb()
            java.lang.String r2 = r6.zzc()
            r5.zzf = r2
            java.lang.String r6 = r6.zzd()
            r5.zzg = r6
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzic
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r2.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L88
            java.lang.String r6 = r5.zzf
            com.google.android.gms.internal.ads.zzgba r2 = com.google.android.gms.internal.ads.zzgba.zzd()
            java.lang.String r3 = "dialog_impression"
            r5.zzu(r6, r3, r2)
            com.google.android.gms.ads.internal.zzu.zzp()
            android.app.AlertDialog$Builder r6 = com.google.android.gms.ads.internal.util.zzt.zzK(r0)
            int r2 = com.google.android.gms.ads.impl.R.string.offline_opt_in_title
            java.lang.String r3 = "Open ad when you're back online."
            java.lang.String r2 = zzt(r2, r3)
            android.app.AlertDialog$Builder r2 = r6.setTitle(r2)
            int r3 = com.google.android.gms.ads.impl.R.string.offline_opt_in_message
            java.lang.String r4 = "We'll send you a notification with a link to the advertiser site."
            java.lang.String r3 = zzt(r3, r4)
            android.app.AlertDialog$Builder r2 = r2.setMessage(r3)
            int r3 = com.google.android.gms.ads.impl.R.string.offline_opt_in_confirm
            java.lang.String r4 = "OK"
            java.lang.String r3 = zzt(r3, r4)
            com.google.android.gms.internal.ads.zzeff r4 = new com.google.android.gms.internal.ads.zzeff
            r4.<init>(r5, r0, r1)
            android.app.AlertDialog$Builder r0 = r2.setPositiveButton(r3, r4)
            int r2 = com.google.android.gms.ads.impl.R.string.offline_opt_in_decline
            java.lang.String r3 = "No thanks"
            java.lang.String r2 = zzt(r2, r3)
            com.google.android.gms.internal.ads.zzefg r3 = new com.google.android.gms.internal.ads.zzefg
            r3.<init>(r5, r1)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r3)
            com.google.android.gms.internal.ads.zzefh r2 = new com.google.android.gms.internal.ads.zzefh
            r2.<init>(r5, r1)
            r0.setOnCancelListener(r2)
            android.app.AlertDialog r6 = r6.create()
            r6.show()
            return
        L88:
            r5.zzw(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzh() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeer r0 = new com.google.android.gms.internal.ads.zzeer
            com.google.android.gms.ads.internal.util.client.zzr r1 = r2.zzd
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzeey r1 = r2.zze
            r1.zze(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzi(com.google.android.gms.dynamic.IObjectWrapper r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.ads.internal.offline.buffering.zza r0 = new com.google.android.gms.ads.internal.offline.buffering.zza
            java.lang.String r1 = ""
            r0.<init>(r4, r5, r1)
            r2.zzj(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r10, com.google.android.gms.ads.internal.offline.buffering.zza r11) {
            r9 = this;
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)
            android.content.Context r10 = (android.content.Context) r10
            java.lang.String r0 = r11.zza
            java.lang.String r1 = r11.zzb
            java.lang.String r11 = r11.zzc
            java.lang.String r2 = r9.zzs()
            com.google.android.gms.ads.internal.util.zzab r3 = com.google.android.gms.ads.internal.zzu.zzq()
            java.lang.String r4 = "offline_notification_channel"
            java.lang.String r5 = "AdMob Offline Notifications"
            r3.zzh(r10, r4, r5)
            java.lang.String r3 = "offline_notification_clicked"
            android.app.PendingIntent r3 = zzr(r10, r3, r1, r0)
            java.lang.String r5 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = zzr(r10, r5, r1, r0)
            androidx.core.app.NotificationCompat$Builder r5 = new androidx.core.app.NotificationCompat$Builder
            r5.<init>(r10, r4)
            boolean r4 = r2.isEmpty()
            r6 = 1
            if (r4 != 0) goto L48
            int r4 = com.google.android.gms.ads.impl.R.string.offline_notification_title_with_advertiser
            java.lang.String r7 = "You are back online! Continue learning about %s"
            java.lang.String r4 = zzt(r4, r7)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r2
            java.lang.String r2 = java.lang.String.format(r4, r7)
            r5.setContentTitle(r2)
            goto L53
        L48:
            int r2 = com.google.android.gms.ads.impl.R.string.offline_notification_title
            java.lang.String r4 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = zzt(r2, r4)
            r5.setContentTitle(r2)
        L53:
            androidx.core.app.NotificationCompat$Builder r2 = r5.setAutoCancel(r6)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setDeleteIntent(r0)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setContentIntent(r3)
            android.content.pm.ApplicationInfo r2 = r10.getApplicationInfo()
            int r2 = r2.icon
            androidx.core.app.NotificationCompat$Builder r0 = r0.setSmallIcon(r2)
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzid
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setPriority(r2)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzif
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto La7
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto La7
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> La7
            r0.<init>(r11)     // Catch: java.io.IOException -> La7
            java.net.URLConnection r11 = r0.openConnection()     // Catch: java.io.IOException -> La7
            java.io.InputStream r11 = r11.getInputStream()     // Catch: java.io.IOException -> La7
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r11)     // Catch: java.io.IOException -> La7
            goto La8
        La7:
            r11 = r2
        La8:
            if (r11 == 0) goto Lbe
            androidx.core.app.NotificationCompat$Builder r0 = r5.setLargeIcon(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            androidx.core.app.NotificationCompat$BigPictureStyle r3 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            r3.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            androidx.core.app.NotificationCompat$BigPictureStyle r11 = r3.bigPicture(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            androidx.core.app.NotificationCompat$BigPictureStyle r11 = r11.bigLargeIcon(r2)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            r0.setStyle(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
        Lbe:
            java.lang.String r11 = "notification"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.app.NotificationManager r10 = (android.app.NotificationManager) r10
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r0 = 54321(0xd431, float:7.612E-41)
            android.app.Notification r2 = r5.build()     // Catch: java.lang.IllegalArgumentException -> Ld8
            r10.notify(r1, r0, r2)     // Catch: java.lang.IllegalArgumentException -> Ld8
            java.lang.String r10 = "offline_notification_impression"
            goto Le4
        Ld8:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "notification_not_shown_reason"
            r11.put(r0, r10)
            java.lang.String r10 = "offline_notification_failed"
        Le4:
            r9.zzu(r1, r10, r11)
            return
    }

    final /* synthetic */ void zzk(android.app.Activity r2, com.google.android.gms.ads.internal.overlay.zzm r3, android.content.DialogInterface r4, int r5) {
            r1 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "dialog_action"
            java.lang.String r0 = "confirm"
            r4.put(r5, r0)
            java.lang.String r5 = r1.zzf
            java.lang.String r0 = "rtsdc"
            r1.zzu(r5, r0, r4)
            com.google.android.gms.ads.internal.util.zzab r4 = com.google.android.gms.ads.internal.zzu.zzq()
            android.content.Intent r4 = r4.zzf(r2)
            r2.startActivity(r4)
            r1.zzv()
            if (r3 == 0) goto L26
            r3.zzb()
        L26:
            return
    }

    final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm r2, android.content.DialogInterface r3, int r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeey r3 = r1.zze
            java.lang.String r4 = r1.zzf
            r3.zzc(r4)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "dialog_action"
            java.lang.String r0 = "dismiss"
            r3.put(r4, r0)
            java.lang.String r4 = r1.zzf
            java.lang.String r0 = "rtsdc"
            r1.zzu(r4, r0, r3)
            if (r2 == 0) goto L1f
            r2.zzb()
        L1f:
            return
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm r3, android.content.DialogInterface r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzeey r4 = r2.zze
            java.lang.String r0 = r2.zzf
            r4.zzc(r0)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r0 = "dialog_action"
            java.lang.String r1 = "dismiss"
            r4.put(r0, r1)
            java.lang.String r0 = r2.zzf
            java.lang.String r1 = "rtsdc"
            r2.zzu(r0, r1, r4)
            if (r3 == 0) goto L1f
            r3.zzb()
        L1f:
            return
    }

    final /* synthetic */ void zzn(android.app.Activity r2, com.google.android.gms.ads.internal.overlay.zzm r3, android.content.DialogInterface r4, int r5) {
            r1 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "dialog_action"
            java.lang.String r0 = "confirm"
            r4.put(r5, r0)
            java.lang.String r5 = r1.zzf
            java.lang.String r0 = "dialog_click"
            r1.zzu(r5, r0, r4)
            r1.zzw(r2, r3)
            return
    }

    final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm r2, android.content.DialogInterface r3, int r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeey r3 = r1.zze
            java.lang.String r4 = r1.zzf
            r3.zzc(r4)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "dialog_action"
            java.lang.String r0 = "dismiss"
            r3.put(r4, r0)
            java.lang.String r4 = r1.zzf
            java.lang.String r0 = "dialog_click"
            r1.zzu(r4, r0, r3)
            if (r2 == 0) goto L1f
            r2.zzb()
        L1f:
            return
    }

    final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm r3, android.content.DialogInterface r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzeey r4 = r2.zze
            java.lang.String r0 = r2.zzf
            r4.zzc(r0)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r0 = "dialog_action"
            java.lang.String r1 = "dismiss"
            r4.put(r0, r1)
            java.lang.String r0 = r2.zzf
            java.lang.String r1 = "dialog_click"
            r2.zzu(r0, r1, r4)
            if (r3 == 0) goto L1f
            r3.zzb()
        L1f:
            return
    }

    public final void zzq(java.lang.String r4, com.google.android.gms.internal.ads.zzdkp r5) {
            r3 = this;
            java.lang.String r0 = r5.zzx()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = ""
            if (r0 != 0) goto L11
            java.lang.String r0 = r5.zzx()
            goto L1d
        L11:
            java.lang.String r0 = r5.zzB()
            if (r0 == 0) goto L1c
            java.lang.String r0 = r5.zzB()
            goto L1d
        L1c:
            r0 = r1
        L1d:
            com.google.android.gms.internal.ads.zzbgc r2 = r5.zzm()
            if (r2 != 0) goto L24
            goto L2e
        L24:
            android.net.Uri r2 = r2.zze()     // Catch: android.os.RemoteException -> L2d
            java.lang.String r1 = r2.toString()     // Catch: android.os.RemoteException -> L2d
            goto L2e
        L2d:
        L2e:
            com.google.android.gms.internal.ads.zzbgc r5 = r5.zzn()
            r2 = 0
            if (r5 != 0) goto L36
            goto L43
        L36:
            com.google.android.gms.dynamic.IObjectWrapper r5 = r5.zzf()     // Catch: android.os.RemoteException -> L43
            if (r5 == 0) goto L43
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)     // Catch: android.os.RemoteException -> L43
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5     // Catch: android.os.RemoteException -> L43
            r2 = r5
        L43:
            com.google.android.gms.internal.ads.zzeem r5 = new com.google.android.gms.internal.ads.zzeem
            r5.<init>(r0, r1, r2)
            java.util.Map r0 = r3.zza
            r0.put(r4, r5)
            return
    }
}
