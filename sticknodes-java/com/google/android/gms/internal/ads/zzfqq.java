package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfqq extends com.google.android.gms.internal.ads.zzfqm {
    public zzfqq(com.google.android.gms.internal.ads.zzfqf r1, java.util.HashSet r2, org.json.JSONObject r3, long r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private final void zzc(java.lang.String r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza()
            if (r0 == 0) goto L30
            java.util.Collection r0 = r0.zzc()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfom r1 = (com.google.android.gms.internal.ads.zzfom) r1
            java.util.HashSet r2 = r4.zza
            java.lang.String r3 = r1.zzh()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto Le
            com.google.android.gms.internal.ads.zzfpr r1 = r1.zzg()
            long r2 = r4.zzc
            r1.zzd(r5, r2)
            goto Le
        L30:
            return
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r1) {
            r0 = this;
            org.json.JSONObject r1 = r0.zzb
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfqn, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.zzc(r1)
            super.zza(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    protected final void zza(java.lang.String r1) {
            r0 = this;
            r0.zzc(r1)
            super.zza(r1)
            return
    }
}
