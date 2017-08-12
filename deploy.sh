#!/bin/bash

echo commit description:
read description
boot cljs target
git add .
eval "git commit -am \"$description\""
git push
git subtree push --prefix target origin gh-pages
