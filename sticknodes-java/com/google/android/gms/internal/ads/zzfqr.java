package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfqr extends com.google.android.gms.internal.ads.zzfqm {
    public zzfqr(com.google.android.gms.internal.ads.zzfqf r1, java.util.HashSet r2, org.json.JSONObject r3, long r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfqf r2 = r1.zzd
            org.json.JSONObject r0 = r1.zzb
            org.json.JSONObject r2 = r2.zza()
            boolean r2 = com.google.android.gms.internal.ads.zzfpx.zzg(r0, r2)
            if (r2 == 0) goto L10
            r2 = 0
            return r2
        L10:
            com.google.android.gms.internal.ads.zzfqf r2 = r1.zzd
            org.json.JSONObject r0 = r1.zzb
            r2.zze(r0)
            org.json.JSONObject r2 = r1.zzb
            java.lang.String r2 = r2.toString()
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzfqn, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.zza(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    protected final void zza(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L36
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza()
            if (r0 == 0) goto L36
            java.util.Collection r0 = r0.zzc()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfom r1 = (com.google.android.gms.internal.ads.zzfom) r1
            java.util.HashSet r2 = r4.zza
            java.lang.String r3 = r1.zzh()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L14
            com.google.android.gms.internal.ads.zzfpr r1 = r1.zzg()
            long r2 = r4.zzc
            r1.zzh(r5, r2)
            goto L14
        L36:
            super.zza(r5)
            return
    }
}
