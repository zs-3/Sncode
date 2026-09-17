package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbso extends com.google.android.gms.internal.ads.zzbsp implements com.google.android.gms.internal.ads.zzbjw {
    android.util.DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final com.google.android.gms.internal.ads.zzcfo zzh;
    private final android.content.Context zzi;
    private final android.view.WindowManager zzj;
    private final com.google.android.gms.internal.ads.zzbcd zzk;
    private float zzl;
    private int zzm;

    public zzbso(com.google.android.gms.internal.ads.zzcfo r2, android.content.Context r3, com.google.android.gms.internal.ads.zzbcd r4) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r2, r0)
            r0 = -1
            r1.zzb = r0
            r1.zzc = r0
            r1.zzd = r0
            r1.zze = r0
            r1.zzf = r0
            r1.zzg = r0
            r1.zzh = r2
            r1.zzi = r3
            r1.zzk = r4
            java.lang.String r2 = "window"
            java.lang.Object r2 = r3.getSystemService(r2)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r1.zzj = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* synthetic */ void zza(java.lang.Object r9, java.util.Map r10) {
            r8 = this;
            com.google.android.gms.internal.ads.zzcfo r9 = (com.google.android.gms.internal.ads.zzcfo) r9
            android.util.DisplayMetrics r9 = new android.util.DisplayMetrics
            r9.<init>()
            r8.zza = r9
            android.view.WindowManager r9 = r8.zzj
            android.view.Display r9 = r9.getDefaultDisplay()
            android.util.DisplayMetrics r10 = r8.zza
            r9.getMetrics(r10)
            android.util.DisplayMetrics r10 = r8.zza
            float r10 = r10.density
            r8.zzl = r10
            int r9 = r9.getRotation()
            r8.zzm = r9
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.util.DisplayMetrics r9 = r8.zza
            int r10 = r9.widthPixels
            int r9 = com.google.android.gms.ads.internal.util.client.zzf.zzw(r9, r10)
            r8.zzb = r9
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.util.DisplayMetrics r9 = r8.zza
            int r10 = r9.heightPixels
            int r9 = com.google.android.gms.ads.internal.util.client.zzf.zzw(r9, r10)
            r8.zzc = r9
            com.google.android.gms.internal.ads.zzcfo r9 = r8.zzh
            android.app.Activity r9 = r9.zzi()
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L6d
            android.view.Window r1 = r9.getWindow()
            if (r1 != 0) goto L4b
            goto L6d
        L4b:
            com.google.android.gms.ads.internal.zzu.zzp()
            int[] r9 = com.google.android.gms.ads.internal.util.zzt.zzQ(r9)
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.util.DisplayMetrics r1 = r8.zza
            r2 = r9[r0]
            int r1 = com.google.android.gms.ads.internal.util.client.zzf.zzw(r1, r2)
            r8.zzd = r1
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.util.DisplayMetrics r1 = r8.zza
            r9 = r9[r10]
            int r9 = com.google.android.gms.ads.internal.util.client.zzf.zzw(r1, r9)
            r8.zze = r9
            goto L75
        L6d:
            int r9 = r8.zzb
            r8.zzd = r9
            int r9 = r8.zzc
            r8.zze = r9
        L75:
            com.google.android.gms.internal.ads.zzcfo r9 = r8.zzh
            com.google.android.gms.internal.ads.zzchi r9 = r9.zzO()
            boolean r9 = r9.zzi()
            if (r9 == 0) goto L8a
            int r9 = r8.zzb
            r8.zzf = r9
            int r9 = r8.zzc
            r8.zzg = r9
            goto L8f
        L8a:
            com.google.android.gms.internal.ads.zzcfo r9 = r8.zzh
            r9.measure(r0, r0)
        L8f:
            int r2 = r8.zzb
            int r3 = r8.zzc
            int r4 = r8.zzd
            int r5 = r8.zze
            float r6 = r8.zzl
            int r7 = r8.zzm
            r1 = r8
            r1.zzj(r2, r3, r4, r5, r6, r7)
            com.google.android.gms.internal.ads.zzbsn r9 = new com.google.android.gms.internal.ads.zzbsn
            r9.<init>()
            com.google.android.gms.internal.ads.zzbcd r1 = r8.zzk
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.DIAL"
            r2.<init>(r3)
            java.lang.String r3 = "tel:"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r2.setData(r3)
            boolean r1 = r1.zza(r2)
            r9.zze(r1)
            com.google.android.gms.internal.ads.zzbcd r1 = r8.zzk
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3)
            java.lang.String r3 = "sms:"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r2.setData(r3)
            boolean r1 = r1.zza(r2)
            r9.zzc(r1)
            com.google.android.gms.internal.ads.zzbcd r1 = r8.zzk
            boolean r1 = r1.zzb()
            r9.zza(r1)
            com.google.android.gms.internal.ads.zzbcd r1 = r8.zzk
            boolean r1 = r1.zzc()
            r9.zzd(r1)
            r9.zzb(r10)
            boolean r1 = com.google.android.gms.internal.ads.zzbsn.zzh(r9)
            boolean r2 = com.google.android.gms.internal.ads.zzbsn.zzj(r9)
            boolean r3 = com.google.android.gms.internal.ads.zzbsn.zzf(r9)
            boolean r4 = com.google.android.gms.internal.ads.zzbsn.zzi(r9)
            boolean r9 = com.google.android.gms.internal.ads.zzbsn.zzg(r9)
            com.google.android.gms.internal.ads.zzcfo r5 = r8.zzh
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L125
            r6.<init>()     // Catch: org.json.JSONException -> L125
            java.lang.String r7 = "sms"
            org.json.JSONObject r1 = r6.put(r7, r1)     // Catch: org.json.JSONException -> L125
            java.lang.String r6 = "tel"
            org.json.JSONObject r1 = r1.put(r6, r2)     // Catch: org.json.JSONException -> L125
            java.lang.String r2 = "calendar"
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: org.json.JSONException -> L125
            java.lang.String r2 = "storePicture"
            org.json.JSONObject r1 = r1.put(r2, r4)     // Catch: org.json.JSONException -> L125
            java.lang.String r2 = "inlineVideo"
            org.json.JSONObject r9 = r1.put(r2, r9)     // Catch: org.json.JSONException -> L125
            goto L12c
        L125:
            r9 = move-exception
            java.lang.String r1 = "Error occurred while obtaining the MRAID capabilities."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r9)
            r9 = 0
        L12c:
            java.lang.String r1 = "onDeviceFeaturesReceived"
            r5.zze(r1, r9)
            com.google.android.gms.internal.ads.zzcfo r9 = r8.zzh
            r1 = 2
            int[] r2 = new int[r1]
            r9.getLocationOnScreen(r2)
            android.content.Context r9 = r8.zzi
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            r0 = r2[r0]
            int r9 = r3.zzb(r9, r0)
            android.content.Context r0 = r8.zzi
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            r10 = r2[r10]
            int r10 = r3.zzb(r0, r10)
            r8.zzb(r9, r10)
            boolean r9 = com.google.android.gms.ads.internal.util.client.zzm.zzm(r1)
            if (r9 == 0) goto L15f
            java.lang.String r9 = "Dispatching Ready Event."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r9)
        L15f:
            com.google.android.gms.internal.ads.zzcfo r9 = r8.zzh
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r9 = r9.zzn()
            java.lang.String r9 = r9.afmaVersion
            r8.zzi(r9)
            return
    }

    public final void zzb(int r7, int r8) {
            r6 = this;
            android.content.Context r0 = r6.zzi
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L13
            com.google.android.gms.ads.internal.zzu.zzp()
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = com.google.android.gms.ads.internal.util.zzt.zzR(r0)
            r0 = r0[r2]
            goto L14
        L13:
            r0 = 0
        L14:
            com.google.android.gms.internal.ads.zzcfo r1 = r6.zzh
            com.google.android.gms.internal.ads.zzchi r1 = r1.zzO()
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.zzcfo r1 = r6.zzh
            com.google.android.gms.internal.ads.zzchi r1 = r1.zzO()
            boolean r1 = r1.zzi()
            if (r1 != 0) goto L84
        L28:
            com.google.android.gms.internal.ads.zzcfo r1 = r6.zzh
            int r3 = r1.getWidth()
            int r1 = r1.getHeight()
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzX
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6b
            if (r3 != 0) goto L58
            com.google.android.gms.internal.ads.zzcfo r3 = r6.zzh
            com.google.android.gms.internal.ads.zzchi r3 = r3.zzO()
            if (r3 == 0) goto L57
            com.google.android.gms.internal.ads.zzcfo r3 = r6.zzh
            com.google.android.gms.internal.ads.zzchi r3 = r3.zzO()
            int r3 = r3.zzb
            goto L58
        L57:
            r3 = 0
        L58:
            if (r1 != 0) goto L6b
            com.google.android.gms.internal.ads.zzcfo r1 = r6.zzh
            com.google.android.gms.internal.ads.zzchi r1 = r1.zzO()
            if (r1 == 0) goto L6c
            com.google.android.gms.internal.ads.zzcfo r1 = r6.zzh
            com.google.android.gms.internal.ads.zzchi r1 = r1.zzO()
            int r2 = r1.zza
            goto L6c
        L6b:
            r2 = r1
        L6c:
            android.content.Context r1 = r6.zzi
            com.google.android.gms.ads.internal.util.client.zzf r4 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r1 = r4.zzb(r1, r3)
            r6.zzf = r1
            android.content.Context r1 = r6.zzi
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r1 = r3.zzb(r1, r2)
            r6.zzg = r1
        L84:
            int r0 = r8 - r0
            int r1 = r6.zzf
            int r2 = r6.zzg
            r6.zzg(r7, r0, r1, r2)
            com.google.android.gms.internal.ads.zzcfo r0 = r6.zzh
            com.google.android.gms.internal.ads.zzchg r0 = r0.zzN()
            r0.zzC(r7, r8)
            return
    }
}
