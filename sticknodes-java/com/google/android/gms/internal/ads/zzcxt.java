package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcxt extends com.google.android.gms.ads.internal.client.zzdx {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.util.List zze;
    private final long zzf;
    private final java.lang.String zzg;
    private final com.google.android.gms.internal.ads.zzegp zzh;
    private final android.os.Bundle zzi;

    public zzcxt(com.google.android.gms.internal.ads.zzfgh r3, java.lang.String r4, com.google.android.gms.internal.ads.zzegp r5, com.google.android.gms.internal.ads.zzfgk r6, java.lang.String r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            if (r3 != 0) goto L8
            r1 = r0
            goto La
        L8:
            java.lang.String r1 = r3.zzab
        La:
            r2.zzb = r1
            r2.zzc = r7
            if (r6 != 0) goto L12
            r7 = r0
            goto L14
        L12:
            java.lang.String r7 = r6.zzb
        L14:
            r2.zzd = r7
            java.lang.String r7 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L26
            java.lang.String r7 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L30
        L26:
            org.json.JSONObject r3 = r3.zzv     // Catch: org.json.JSONException -> L2f
            java.lang.String r7 = "class_name"
            java.lang.String r0 = r3.getString(r7)     // Catch: org.json.JSONException -> L2f
            goto L30
        L2f:
        L30:
            if (r0 == 0) goto L33
            r4 = r0
        L33:
            r2.zza = r4
            java.util.List r3 = r5.zzc()
            r2.zze = r3
            r2.zzh = r5
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r3.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            r2.zzf = r3
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzgB
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L63
            if (r6 == 0) goto L63
            android.os.Bundle r3 = r6.zzk
            r2.zzi = r3
            goto L6a
        L63:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2.zzi = r3
        L6a:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zziO
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L8a
            if (r6 == 0) goto L8a
            java.lang.String r3 = r6.zzi
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L87
            goto L8a
        L87:
            java.lang.String r3 = r6.zzi
            goto L8c
        L8a:
            java.lang.String r3 = ""
        L8c:
            r2.zzg = r3
            return
    }

    public final long zzc() {
            r2 = this;
            long r0 = r2.zzf
            return r0
    }

    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final android.os.Bundle zze() {
            r1 = this;
            android.os.Bundle r0 = r1.zzi
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final com.google.android.gms.ads.internal.client.zzw zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzegp r0 = r1.zzh
            if (r0 == 0) goto L9
            com.google.android.gms.ads.internal.client.zzw r0 = r0.zza()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzg() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzh() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzi() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.util.List zzj() {
            r1 = this;
            java.util.List r0 = r1.zze
            return r0
    }

    public final java.lang.String zzk() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }
}
