package org.apache.commons.lang3.exception;

/* loaded from: classes2.dex */
public class DefaultExceptionContext implements org.apache.commons.lang3.exception.ExceptionContext, java.io.Serializable {
    private static final long serialVersionUID = 20110706;
    private final java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> contextValues;

    public DefaultExceptionContext() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.contextValues = r0
            return
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public org.apache.commons.lang3.exception.DefaultExceptionContext addContextValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r0 = r2.contextValues
            org.apache.commons.lang3.tuple.ImmutablePair r1 = new org.apache.commons.lang3.tuple.ImmutablePair
            r1.<init>(r3, r4)
            r0.add(r1)
            return r2
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public /* bridge */ /* synthetic */ org.apache.commons.lang3.exception.ExceptionContext addContextValue(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            org.apache.commons.lang3.exception.DefaultExceptionContext r1 = r0.addContextValue(r1, r2)
            return r1
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries() {
            r1 = this;
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r0 = r1.contextValues
            return r0
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.util.Set<java.lang.String> getContextLabels() {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r1 = r3.contextValues
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            org.apache.commons.lang3.tuple.Pair r2 = (org.apache.commons.lang3.tuple.Pair) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r2)
            goto Lb
        L21:
            return r0
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.util.List<java.lang.Object> getContextValues(java.lang.String r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r1 = r4.contextValues
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            org.apache.commons.lang3.tuple.Pair r2 = (org.apache.commons.lang3.tuple.Pair) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = org.apache.commons.lang3.StringUtils.equals(r5, r3)
            if (r3 == 0) goto Lb
            java.lang.Object r2 = r2.getValue()
            r0.add(r2)
            goto Lb
        L2b:
            return r0
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.lang.Object getFirstContextValue(java.lang.String r4) {
            r3 = this;
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r0 = r3.contextValues
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            org.apache.commons.lang3.tuple.Pair r1 = (org.apache.commons.lang3.tuple.Pair) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = org.apache.commons.lang3.StringUtils.equals(r4, r2)
            if (r2 == 0) goto L6
            java.lang.Object r4 = r1.getValue()
            return r4
        L23:
            r4 = 0
            return r4
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.lang.String getFormattedExceptionMessage(java.lang.String r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            if (r6 == 0) goto Lc
            r0.append(r6)
        Lc:
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r6 = r5.contextValues
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L89
            int r6 = r0.length()
            if (r6 <= 0) goto L1f
            r6 = 10
            r0.append(r6)
        L1f:
            java.lang.String r6 = "Exception Context:\n"
            r0.append(r6)
            r6 = 0
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r1 = r5.contextValues
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            org.apache.commons.lang3.tuple.Pair r2 = (org.apache.commons.lang3.tuple.Pair) r2
            java.lang.String r3 = "\t["
            r0.append(r3)
            int r6 = r6 + 1
            r0.append(r6)
            r3 = 58
            r0.append(r3)
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r3 = "="
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L60
            java.lang.String r2 = "null"
            r0.append(r2)
            goto L7e
        L60:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L65
            goto L7b
        L65:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception thrown on toString(): "
            r3.append(r4)
            java.lang.String r2 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L7b:
            r0.append(r2)
        L7e:
            java.lang.String r2 = "]\n"
            r0.append(r2)
            goto L2b
        L84:
            java.lang.String r6 = "---------------------------------"
            r0.append(r6)
        L89:
            java.lang.String r6 = r0.toString()
            return r6
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public org.apache.commons.lang3.exception.DefaultExceptionContext setContextValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r0 = r2.contextValues
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            org.apache.commons.lang3.tuple.Pair r1 = (org.apache.commons.lang3.tuple.Pair) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = org.apache.commons.lang3.StringUtils.equals(r3, r1)
            if (r1 == 0) goto L6
            r0.remove()
            goto L6
        L22:
            r2.addContextValue(r3, r4)
            return r2
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public /* bridge */ /* synthetic */ org.apache.commons.lang3.exception.ExceptionContext setContextValue(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            org.apache.commons.lang3.exception.DefaultExceptionContext r1 = r0.setContextValue(r1, r2)
            return r1
    }
}
