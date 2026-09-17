package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbip implements com.google.android.gms.internal.ads.zzbjw {
    public zzbip() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r9, java.util.Map r10) {
            r8 = this;
            com.google.android.gms.internal.ads.zzcfo r9 = (com.google.android.gms.internal.ads.zzcfo) r9
            java.lang.String r0 = "action"
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "tick"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L70
            java.lang.String r0 = "label"
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "start_label"
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "timestamp"
            java.lang.Object r10 = r10.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L36
            java.lang.String r9 = "No label given for CSI tick."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r9)
            return
        L36:
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L42
            java.lang.String r9 = "No timestamp given for CSI tick."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r9)
            return
        L42:
            long r2 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L69
            com.google.android.gms.common.util.Clock r10 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.NumberFormatException -> L69
            long r4 = r10.currentTimeMillis()     // Catch: java.lang.NumberFormatException -> L69
            com.google.android.gms.common.util.Clock r10 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.NumberFormatException -> L69
            long r6 = r10.elapsedRealtime()     // Catch: java.lang.NumberFormatException -> L69
            long r2 = r2 - r4
            long r6 = r6 + r2
            r10 = 1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r10 != r2) goto L61
            java.lang.String r1 = "native:view_load"
        L61:
            com.google.android.gms.internal.ads.zzbdi r9 = r9.zzm()
            r9.zzc(r0, r1, r6)
            return
        L69:
            r9 = move-exception
            java.lang.String r10 = "Malformed timestamp for CSI tick."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r10, r9)
            return
        L70:
            java.lang.String r1 = "experiment"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "value"
            if (r1 == 0) goto L9a
            java.lang.Object r10 = r10.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L8c
            java.lang.String r9 = "No value given for CSI experiment."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r9)
            return
        L8c:
            com.google.android.gms.internal.ads.zzbdi r9 = r9.zzm()
            com.google.android.gms.internal.ads.zzbdk r9 = r9.zza()
            java.lang.String r0 = "e"
            r9.zzd(r0, r10)
            return
        L9a:
            java.lang.String r1 = "extra"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld3
            java.lang.String r0 = "name"
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r10 = r10.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto Lbc
            java.lang.String r9 = "No value given for CSI extra."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r9)
            return
        Lbc:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lc8
            java.lang.String r9 = "No name given for CSI extra."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r9)
            return
        Lc8:
            com.google.android.gms.internal.ads.zzbdi r9 = r9.zzm()
            com.google.android.gms.internal.ads.zzbdk r9 = r9.zza()
            r9.zzd(r0, r10)
        Ld3:
            return
    }
}
