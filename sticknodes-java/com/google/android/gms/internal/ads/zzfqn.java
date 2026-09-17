package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzfqn extends android.os.AsyncTask {
    private com.google.android.gms.internal.ads.zzfqo zza;
    protected final com.google.android.gms.internal.ads.zzfqf zzd;

    public zzfqn(com.google.android.gms.internal.ads.zzfqf r1) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            return
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.zza(r1)
            return
    }

    protected void zza(java.lang.String r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzfqo r1 = r0.zza
            if (r1 == 0) goto L7
            r1.zza(r0)
        L7:
            return
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfqo r1) {
            r0 = this;
            r0.zza = r1
            return
    }
}
