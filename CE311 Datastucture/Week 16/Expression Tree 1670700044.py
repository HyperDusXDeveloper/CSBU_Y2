class N: __init__=lambda s,v,l=0,r=0:vars(s).update(v=v,l=l,r=r)
def G(n,m): return "" if not n else (f"({G(n.l,m)}{n.v}{G(n.r,m)})" if m&1 else f"{G(n.l,m)}{n.v}{G(n.r,m)}") if m<2 else f"{n.v} {G(n.l,2)} {G(n.r,2)}" if m==2 else f"{G(n.l,3)} {G(n.r,3)} {n.v}"
for e in ["/ * 2 + 3 5 - 9 1", "2 3 5 + * 9 1 - /"]:
    t=e.split(); p=t[0]in"*/+-"; s=[]; print(f"\nInput: {e}\nDetected: {'Prefix' if p else 'Postfix'}\n"+'-'*30)
    for x in (t[::-1] if p else t): s.append(N(x) if x not in "*/+-" else N(x,s.pop(),s.pop()) if p else N(x,r=s.pop(),l=s.pop()))
    r=s[0]; print(f"Infix (no parens): {G(r,0)}\nInfix (parens):    {G(r,1)}\nPrefix:            {G(r,2).strip()}\nPostfix:           {G(r,3).strip()}\n"+'-'*30)