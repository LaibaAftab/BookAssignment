package com.example.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class a extends AppCompatActivity {

    ImageView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    TextView aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn,oo,pp,qq,rr,ss,tt,uu,vv,ww,xx,yy,zz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);
        a = (ImageView) findViewById(R.id.ant);
        b = (ImageView) findViewById(R.id.baloon);
        c = (ImageView) findViewById(R.id.cat);
        d = (ImageView) findViewById(R.id.duck);
        e = (ImageView) findViewById(R.id.egg);
        f = (ImageView) findViewById(R.id.fish);
        g = (ImageView) findViewById(R.id.goat);
        h = (ImageView) findViewById(R.id.hammer);
        i = (ImageView) findViewById(R.id.ice);
        j = (ImageView) findViewById(R.id.juice);
        k = (ImageView) findViewById(R.id.kite);
        l = (ImageView) findViewById(R.id.leaf);
        m = (ImageView) findViewById(R.id.mango);
        n = (ImageView) findViewById(R.id.nest);
        o = (ImageView) findViewById(R.id.owl);
        p = (ImageView) findViewById(R.id.parrot);
        q = (ImageView) findViewById(R.id.ques);
        r = (ImageView) findViewById(R.id.rat);
        s = (ImageView) findViewById(R.id.sun);
        t = (ImageView) findViewById(R.id.tree);
        u = (ImageView) findViewById(R.id.umbrella);
        v = (ImageView) findViewById(R.id.violen);
        w = (ImageView) findViewById(R.id.watch);
        x = (ImageView) findViewById(R.id.xylo);
        y = (ImageView) findViewById(R.id.yoyo2);
        z = (ImageView) findViewById(R.id.zebra);

        Intent intent = getIntent();
        String alpha = (String)intent.getStringExtra("Alphabet");
        if(alpha.equals("A"))
        {
            a.setVisibility(View.VISIBLE);
            aa = findViewById(R.id.Aa);
            aa.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("B"))
        {
            b.setVisibility(View.VISIBLE);
            bb = findViewById(R.id.Bb);
            bb.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("C"))
        {
            c.setVisibility(View.VISIBLE);
            cc = findViewById(R.id.Cc);
            cc.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("D"))
        {
            d.setVisibility(View.VISIBLE);
            dd = findViewById(R.id.Dd);
            dd.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("E"))
        {
            e.setVisibility(View.VISIBLE);
            ee = findViewById(R.id.Ee);
            ee.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("F"))
        {
            f.setVisibility(View.VISIBLE);
            ff = findViewById(R.id.Ff);
            ff.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("G"))
        {
            g.setVisibility(View.VISIBLE);
            gg = findViewById(R.id.Gg);
            gg.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("H"))
        {
            h.setVisibility(View.VISIBLE);
            hh = findViewById(R.id.Hh);
            hh.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("I"))
        {
            i.setVisibility(View.VISIBLE);
            ii = findViewById(R.id.Ii);
            ii.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("J"))
        {
            j.setVisibility(View.VISIBLE);
            jj = findViewById(R.id.Jj);
            jj.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("K"))
        {
            k.setVisibility(View.VISIBLE);
            kk = findViewById(R.id.Kk);
            kk.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("L"))
        {
            l.setVisibility(View.VISIBLE);
            ll = findViewById(R.id.Ll);
            ll.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("M"))
        {
            m.setVisibility(View.VISIBLE);
            mm = findViewById(R.id.Mm);
            mm.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("N"))
        {
            n.setVisibility(View.VISIBLE);
            nn = findViewById(R.id.Nn);
            nn.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("O"))
        {
            o.setVisibility(View.VISIBLE);
            oo = findViewById(R.id.Oo);
            oo.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("P"))
        {
            p.setVisibility(View.VISIBLE);
            pp = findViewById(R.id.Pp);
            pp.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("Q"))
        {
            q.setVisibility(View.VISIBLE);
            qq = findViewById(R.id.Qq);
            qq.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("R"))
        {
            r.setVisibility(View.VISIBLE);
            rr = findViewById(R.id.Rr);
            rr.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("S"))
        {
            s.setVisibility(View.VISIBLE);
            ss = findViewById(R.id.Ss);
            ss.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("T"))
        {
            t.setVisibility(View.VISIBLE);
            tt = findViewById(R.id.Tt);
            tt.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("U"))
        {
            u.setVisibility(View.VISIBLE);
            uu = findViewById(R.id.Uu);
            uu.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("V"))
        {
            v.setVisibility(View.VISIBLE);
            vv = findViewById(R.id.Vv);
            vv.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("W"))
        {
            w.setVisibility(View.VISIBLE);
            ww = findViewById(R.id.Ww);
            ww.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("X"))
        {
            x.setVisibility(View.VISIBLE);
            xx = findViewById(R.id.Xx);
            xx.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("Y"))
        {
            y.setVisibility(View.VISIBLE);
            yy = findViewById(R.id.Yy);
            yy.setVisibility(View.VISIBLE);
        }
        else if(alpha.equals("Z"))
        {
            z.setVisibility(View.VISIBLE);
            zz = findViewById(R.id.Zz);
            zz.setVisibility(View.VISIBLE);
        }




    }

}