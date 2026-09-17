package com.google.common.collect;

/* loaded from: classes2.dex */
public final class Maps {

    /* renamed from: com.google.common.collect.Maps$1, reason: invalid class name */
    class AnonymousClass1 extends com.google.common.collect.TransformedIterator<java.util.Map.Entry<java.lang.Object, java.lang.Object>, java.lang.Object> {
    }

    private enum EntryFunction extends java.lang.Enum<com.google.common.collect.Maps.EntryFunction> implements com.google.common.base.Function<java.util.Map.Entry<?, ?>, java.lang.Object> {
        private static final /* synthetic */ com.google.common.collect.Maps.EntryFunction[] $VALUES = null;
        public static final com.google.common.collect.Maps.EntryFunction KEY = null;
        public static final com.google.common.collect.Maps.EntryFunction VALUE = null;



        private static /* synthetic */ com.google.common.collect.Maps.EntryFunction[] $values() {
                r0 = 2
                com.google.common.collect.Maps$EntryFunction[] r0 = new com.google.common.collect.Maps.EntryFunction[r0]
                com.google.common.collect.Maps$EntryFunction r1 = com.google.common.collect.Maps.EntryFunction.KEY
                r2 = 0
                r0[r2] = r1
                com.google.common.collect.Maps$EntryFunction r1 = com.google.common.collect.Maps.EntryFunction.VALUE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.collect.Maps$EntryFunction$1 r0 = new com.google.common.collect.Maps$EntryFunction$1
                java.lang.String r1 = "KEY"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.collect.Maps.EntryFunction.KEY = r0
                com.google.common.collect.Maps$EntryFunction$2 r0 = new com.google.common.collect.Maps$EntryFunction$2
                java.lang.String r1 = "VALUE"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.common.collect.Maps.EntryFunction.VALUE = r0
                com.google.common.collect.Maps$EntryFunction[] r0 = $values()
                com.google.common.collect.Maps.EntryFunction.$VALUES = r0
                return
        }

        EntryFunction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ EntryFunction(java.lang.String r1, int r2, com.google.common.collect.Maps.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.collect.Maps.EntryFunction valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.Maps$EntryFunction> r0 = com.google.common.collect.Maps.EntryFunction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.Maps$EntryFunction r1 = (com.google.common.collect.Maps.EntryFunction) r1
                return r1
        }

        public static com.google.common.collect.Maps.EntryFunction[] values() {
                com.google.common.collect.Maps$EntryFunction[] r0 = com.google.common.collect.Maps.EntryFunction.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.Maps$EntryFunction[] r0 = (com.google.common.collect.Maps.EntryFunction[]) r0
                return r0
        }
    }

    static boolean equalsImpl(java.util.Map<?, ?> r1, java.lang.Object r2) {
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L17
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r1 = r1.entrySet()
            java.util.Set r2 = r2.entrySet()
            boolean r1 = r1.equals(r2)
            return r1
        L17:
            r1 = 0
            return r1
    }

    static java.lang.String toStringImpl(java.util.Map<?, ?> r4) {
            int r0 = r4.size()
            java.lang.StringBuilder r0 = com.google.common.collect.Collections2.newStringBuilderForCollection(r0)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r1 = 1
        L16:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r1 != 0) goto L29
            java.lang.String r1 = ", "
            r0.append(r1)
        L29:
            r1 = 0
            java.lang.Object r3 = r2.getKey()
            r0.append(r3)
            r3 = 61
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            goto L16
        L3e:
            r4 = 125(0x7d, float:1.75E-43)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    static <V> com.google.common.base.Function<java.util.Map.Entry<?, V>, V> valueFunction() {
            com.google.common.collect.Maps$EntryFunction r0 = com.google.common.collect.Maps.EntryFunction.VALUE
            return r0
    }
}
