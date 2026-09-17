package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzit;
import com.google.android.gms.internal.drive.zziu;

/* loaded from: classes.dex */
public abstract class zziu<MessageType extends com.google.android.gms.internal.drive.zzit<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.drive.zziu<MessageType, BuilderType>> implements com.google.android.gms.internal.drive.zzlr {
    public zziu() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.android.gms.internal.drive.zziu r0 = r1.zzbn()
            return r0
    }

    protected abstract BuilderType zza(MessageType r1);

    @Override // com.google.android.gms.internal.drive.zzlr
    public final /* synthetic */ com.google.android.gms.internal.drive.zzlr zza(com.google.android.gms.internal.drive.zzlq r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzlq r0 = r1.zzda()
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L15
            com.google.android.gms.internal.drive.zzit r2 = (com.google.android.gms.internal.drive.zzit) r2
            com.google.android.gms.internal.drive.zziu r2 = r1.zza(r2)
            return r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "mergeFrom(MessageLite) can only merge messages of the same type."
            r2.<init>(r0)
            throw r2
    }

    public abstract BuilderType zzbn();
}
