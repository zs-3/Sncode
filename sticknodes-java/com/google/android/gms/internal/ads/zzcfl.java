package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcfl implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.webkit.JsPromptResult zza;
    final /* synthetic */ android.widget.EditText zzb;

    zzcfl(android.webkit.JsPromptResult r1, android.widget.EditText r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            android.widget.EditText r1 = r0.zzb
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            android.webkit.JsPromptResult r2 = r0.zza
            r2.confirm(r1)
            return
    }
}
