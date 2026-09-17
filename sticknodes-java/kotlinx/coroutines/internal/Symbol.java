package kotlinx.coroutines.internal;

/* compiled from: Symbol.kt */
/* loaded from: classes2.dex */
public final class Symbol {
    public final java.lang.String symbol;

    public Symbol(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.symbol = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 60
            r0.append(r1)
            java.lang.String r1 = r2.symbol
            r0.append(r1)
            r1 = 62
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
