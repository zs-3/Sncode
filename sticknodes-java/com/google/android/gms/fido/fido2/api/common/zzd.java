package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzd implements android.os.Parcelable.Creator {
    public zzd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
            r13 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r14)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
        Lf:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L88
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r14)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 2: goto L7e;
                case 3: goto L74;
                case 4: goto L6a;
                case 5: goto L60;
                case 6: goto L56;
                case 7: goto L4c;
                case 8: goto L42;
                case 9: goto L38;
                case 10: goto L2e;
                case 11: goto L24;
                default: goto L20;
            }
        L20:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r14, r1)
            goto Lf
        L24:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.zzai> r2 = com.google.android.gms.fido.fido2.api.common.zzai.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r12 = r1
            com.google.android.gms.fido.fido2.api.common.zzai r12 = (com.google.android.gms.fido.fido2.api.common.zzai) r12
            goto Lf
        L2e:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension> r2 = com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r11 = r1
            com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r11 = (com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension) r11
            goto Lf
        L38:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.zzag> r2 = com.google.android.gms.fido.fido2.api.common.zzag.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r10 = r1
            com.google.android.gms.fido.fido2.api.common.zzag r10 = (com.google.android.gms.fido.fido2.api.common.zzag) r10
            goto Lf
        L42:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.zzu> r2 = com.google.android.gms.fido.fido2.api.common.zzu.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r9 = r1
            com.google.android.gms.fido.fido2.api.common.zzu r9 = (com.google.android.gms.fido.fido2.api.common.zzu) r9
            goto Lf
        L4c:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.zzad> r2 = com.google.android.gms.fido.fido2.api.common.zzad.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r8 = r1
            com.google.android.gms.fido.fido2.api.common.zzad r8 = (com.google.android.gms.fido.fido2.api.common.zzad) r8
            goto Lf
        L56:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.zzab> r2 = com.google.android.gms.fido.fido2.api.common.zzab.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r7 = r1
            com.google.android.gms.fido.fido2.api.common.zzab r7 = (com.google.android.gms.fido.fido2.api.common.zzab) r7
            goto Lf
        L60:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.zzz> r2 = com.google.android.gms.fido.fido2.api.common.zzz.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r6 = r1
            com.google.android.gms.fido.fido2.api.common.zzz r6 = (com.google.android.gms.fido.fido2.api.common.zzz) r6
            goto Lf
        L6a:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension> r2 = com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r5 = r1
            com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r5 = (com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension) r5
            goto Lf
        L74:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.zzs> r2 = com.google.android.gms.fido.fido2.api.common.zzs.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r4 = r1
            com.google.android.gms.fido.fido2.api.common.zzs r4 = (com.google.android.gms.fido.fido2.api.common.zzs) r4
            goto Lf
        L7e:
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension> r2 = com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r14, r1, r2)
            r3 = r1
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r3 = (com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension) r3
            goto Lf
        L88:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r14, r0)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r14 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions[] r1 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions[r1]
            return r1
    }
}
